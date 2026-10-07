// Problem 24: Smaller of Two Numbers
import java.util.Scanner;

public class Program024_SmallerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Smaller = " + (a <= b ? a : b));
    }
}
