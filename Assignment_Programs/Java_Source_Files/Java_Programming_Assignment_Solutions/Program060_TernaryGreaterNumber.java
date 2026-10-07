// Problem 60: Ternary Greater Number
import java.util.Scanner;

public class Program060_TernaryGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Greater = " + (a >= b ? a : b));
    }
}
