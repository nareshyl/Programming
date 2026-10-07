// Problem 17: Check Equal Numbers
import java.util.Scanner;

public class Program017_CheckEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println(a == b ? "Equal" : "Not equal");
    }
}
