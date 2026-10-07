// Problem 7: Calculate Remainder
import java.util.Scanner;

public class Program007_CalculateRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (b == 0) System.out.println("Division by zero is not allowed.");
        else System.out.println("Remainder = " + (a % b));
    }
}
