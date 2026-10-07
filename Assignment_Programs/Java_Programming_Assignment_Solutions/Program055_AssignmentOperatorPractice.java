// Problem 55: Assignment Operator Practice
import java.util.Scanner;

public class Program055_AssignmentOperatorPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and non-zero divisor: ");
        double n = sc.nextDouble(), divisor = sc.nextDouble();
        n += 10; System.out.println("After += 10: " + n);
        n -= 3; System.out.println("After -= 3: " + n);
        n *= 2; System.out.println("After *= 2: " + n);
        if (divisor != 0) { n /= divisor; System.out.println("After /= divisor: " + n); }
        else System.out.println("Division skipped: divisor is zero.");
    }
}
