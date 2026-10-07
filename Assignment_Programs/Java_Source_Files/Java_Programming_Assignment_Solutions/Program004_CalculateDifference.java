// Problem 4: Calculate Difference
import java.util.Scanner;

public class Program004_CalculateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Difference = " + (a - b));
    }
}
