// Problem 18: Compare Two Numbers
import java.util.Scanner;

public class Program018_CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("First greater than second: " + (a > b));
    }
}
