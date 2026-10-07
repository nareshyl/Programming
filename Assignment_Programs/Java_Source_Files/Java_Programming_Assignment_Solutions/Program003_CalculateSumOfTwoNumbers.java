// Problem 3: Calculate Sum of Two Numbers
import java.util.Scanner;

public class Program003_CalculateSumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }
}
