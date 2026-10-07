// Problem 23: Greater of Two Numbers
import java.util.Scanner;

public class Program023_GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Greater = " + (a >= b ? a : b));
    }
}
