#!/usr/bin/env python3
"""
Compile and run Program*.java files with automatically generated test input.

This is a heuristic input generator: it reads Scanner calls in source order and
chooses reasonable values based on nearby variable names and prompt text.
Review execution_logs/summary.txt and individual logs for programs requiring
special or repeated input.
"""
from pathlib import Path
import re
import subprocess
import time

JAVA_DIR = Path.home() / "Documents/Programs/Assignment_Programs/Java_Programming_Assignment_Solutions"
LOG_DIR = JAVA_DIR / "execution_logs"
COMPILE_TIMEOUT = 60
RUN_TIMEOUT = 5

# Optional overrides for programs where automatic input needs adjustment.
# Values are strings sent to stdin, with each token separated by whitespace/newline.
CUSTOM_INPUTS = {
    "Program048_DrivingEligibility": "25 true\n",
    # Add overrides like:
    # "Program003_CalculateSumOfTwoNumbers": "12 8\n",
}

SCANNER_METHOD_RE = re.compile(
    r'\.\s*(nextInt|nextDouble|nextFloat|nextLong|nextBoolean|nextByte|nextShort|nextLine|next)\s*\(\s*\)'
)

def natural_key(path):
    m = re.search(r"Program(\d+)", path.stem)
    return int(m.group(1)) if m else 999999

def choose_value(method, context):
    """Pick a plausible token based on the Scanner method and nearby source."""
    c = context.lower()

    # Identify likely meaning using variable names and prompt strings nearby.
    if method in ("nextBoolean",):
        return "true"
    if method == "nextLine":
        if any(x in c for x in ("department", "course", "branch", "subject", "city", "address")):
            return "Engineering"
        if any(x in c for x in ("name", "employee", "student")):
            return "Naresh"
        return "SampleInput"
    if method == "next":
        if any(x in c for x in ("department", "course", "branch", "subject")):
            return "Engineering"
        if any(x in c for x in ("name", "employee", "student")):
            return "Naresh"
        return "Sample"

    # More meaningful numeric defaults where the context hints at a field.
    if any(x in c for x in ("divisor", "denominator", "quantity", "number of", "count")):
        return "2"
    if any(x in c for x in ("attendance",)):
        return "90"
    if any(x in c for x in ("mark", "score", "grade")):
        return "85"
    if any(x in c for x in ("age",)):
        return "25"
    if any(x in c for x in ("unit", "electricity")):
        return "150"
    if any(x in c for x in ("salary", "principal", "balance", "deposit", "withdraw", "price", "cost", "allowance", "bonus", "deduction", "hra", "income", "amount", "toll", "parking")):
        return "25000"
    if any(x in c for x in ("distance", "length", "breadth", "side", "rate", "time", "fuel", "efficiency", "temperature", "celsius", "kilometre", "kilometer")):
        return "10"
    if any(x in c for x in ("roll", "id", "employee id", "licence", "license")):
        return "101"

    if method in ("nextDouble", "nextFloat"):
        return "10.5"
    if method in ("nextLong",):
        return "1000"
    return "10"

def infer_input(source):
    """Create one input token per Scanner read, using nearby source as context."""
    tokens = []
    for match in SCANNER_METHOD_RE.finditer(source):
        # A limited look-behind gives variable names/prompts around the read.
        context = source[max(0, match.start() - 260):match.start()]
        tokens.append(choose_value(match.group(1), context))
    return "\n".join(tokens) + ("\n" if tokens else "")

def run(command, timeout, input_text=None, cwd=None):
    try:
        result = subprocess.run(
            command, cwd=cwd, input=input_text, text=True,
            capture_output=True, timeout=timeout
        )
        return result.returncode, result.stdout, result.stderr, False
    except subprocess.TimeoutExpired as exc:
        out = exc.stdout or ""
        err = exc.stderr or ""
        if isinstance(out, bytes):
            out = out.decode(errors="replace")
        if isinstance(err, bytes):
            err = err.decode(errors="replace")
        return -1, out, err + f"\nTimed out after {timeout} seconds.", True
    except OSError as exc:
        return -1, "", str(exc), False

def main():
    if not JAVA_DIR.is_dir():
        print(f"Java source directory not found:\n{JAVA_DIR}")
        print("Edit JAVA_DIR at the top of this script to match your folder.")
        return 1

    files = sorted(JAVA_DIR.glob("Program*.java"), key=natural_key)
    if not files:
        print(f"No Program*.java files found in {JAVA_DIR}")
        return 1

    LOG_DIR.mkdir(exist_ok=True)
    print(f"Found {len(files)} Java files.")
    print("Compiling source files...")

    compile_result = subprocess.run(
        ["javac", *[str(f) for f in files]],
        cwd=JAVA_DIR, text=True, capture_output=True, timeout=COMPILE_TIMEOUT
    )
    (LOG_DIR / "compile_stdout.txt").write_text(compile_result.stdout, encoding="utf-8")
    (LOG_DIR / "compile_stderr.txt").write_text(compile_result.stderr, encoding="utf-8")

    if compile_result.returncode != 0:
        print("Compilation failed. See execution_logs/compile_stderr.txt")
        print(compile_result.stderr or compile_result.stdout)
        # Still try to run classes that compiled successfully.

    results = []
    started = time.time()

    for source_file in files:
        class_name = source_file.stem
        source = source_file.read_text(encoding="utf-8", errors="replace")
        input_text = CUSTOM_INPUTS.get(class_name, infer_input(source))
        print(f"Running {class_name}...", end=" ", flush=True)

        code, stdout, stderr, timed_out = run(
            ["java", class_name], RUN_TIMEOUT, input_text=input_text, cwd=JAVA_DIR
        )

        if timed_out:
            status = "TIMEOUT"
        elif code != 0:
            status = "RUNTIME_ERROR"
        elif SCANNER_METHOD_RE.search(source) and not input_text:
            status = "CHECK_INPUT"
        else:
            status = "RAN"

        log_path = LOG_DIR / f"{class_name}.txt"
        log_path.write_text(
            f"Program: {class_name}\nStatus: {status}\nExit code: {code}\n"
            f"\n=== INPUT SENT ===\n{input_text}"
            f"\n=== STDOUT ===\n{stdout}\n=== STDERR ===\n{stderr}",
            encoding="utf-8"
        )
        results.append((class_name, status, code))
        print(status)

    counts = {}
    for _, status, _ in results:
        counts[status] = counts.get(status, 0) + 1

    summary = [
        "JAVA PROGRAM EXECUTION SUMMARY",
        "=" * 40,
        f"Source files: {len(files)}",
        f"Compile exit code: {compile_result.returncode}",
        f"Elapsed seconds: {time.time() - started:.2f}",
        "",
    ]
    summary.extend(f"{name}: {status} (exit={code})" for name, status, code in results)
    summary.extend(["", "STATUS COUNTS:"])
    summary.extend(f"{status}: {count}" for status, count in sorted(counts.items()))
    summary.extend([
        "",
        "NOTE: RAN means the process exited successfully; it does not prove the",
        "program's logic is correct. Input generation is heuristic. Inspect logs",
        "for incorrect values, validation branches, or programs that read input",
        "inside loops or through non-Scanner APIs."
    ])
    summary_path = LOG_DIR / "summary.txt"
    summary_path.write_text("\n".join(summary) + "\n", encoding="utf-8")

    print("\nFinished.")
    print(f"Logs: {LOG_DIR}")
    print(f"Summary: {summary_path}")
    print("Status counts:", counts)
    return 0

if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except subprocess.TimeoutExpired:
        print("Compilation exceeded the timeout.")
        raise SystemExit(1)
