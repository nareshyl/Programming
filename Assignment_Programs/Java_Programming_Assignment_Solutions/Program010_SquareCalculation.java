// Problem 10: Square Calculation
import java.util.Scanner;

public class Program010_SquareCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double s = sc.nextDouble();
        System.out.println("Area = " + (s * s));
        System.out.println("Perimeter = " + (4 * s));
    }
}
