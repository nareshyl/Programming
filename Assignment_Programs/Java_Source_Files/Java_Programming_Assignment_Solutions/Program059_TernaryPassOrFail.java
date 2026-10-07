// Problem 59: Ternary Pass or Fail
import java.util.Scanner;

public class Program059_TernaryPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        System.out.println(marks >= 40 ? "Pass" : "Fail");
    }
}
