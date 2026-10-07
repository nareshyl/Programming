// Problem 54: Arithmetic Expression
import java.util.Scanner;

public class Program054_ArithmeticExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers (a, b, c, d): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
        if (d == 0) System.out.println("Cannot divide by zero.");
        else System.out.println("Result = " + (a + b - c * d / d));
    }
}
