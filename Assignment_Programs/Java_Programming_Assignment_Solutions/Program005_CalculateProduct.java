// Problem 5: Calculate Product
import java.util.Scanner;

public class Program005_CalculateProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Product = " + (a * b));
    }
}
