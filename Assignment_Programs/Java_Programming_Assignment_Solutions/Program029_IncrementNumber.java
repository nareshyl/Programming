// Problem 29: Increment Number
import java.util.Scanner;

public class Program029_IncrementNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("After increment = " + (++n));
    }
}
