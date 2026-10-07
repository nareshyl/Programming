// Problem 6: Calculate Quotient
import java.util.Scanner;

public class Program006_CalculateQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (b == 0) System.out.println("Division by zero is not allowed.");
        else System.out.println("Quotient = " + (a / b));
    }
}
