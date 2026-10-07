// Problem 44: Compare Three Numbers
import java.util.Scanner;

public class Program044_CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("All equal: " + (a == b && b == c));
        System.out.println("a >= b: " + (a >= b) + ", b >= c: " + (b >= c) + ", a >= c: " + (a >= c));
    }
}
