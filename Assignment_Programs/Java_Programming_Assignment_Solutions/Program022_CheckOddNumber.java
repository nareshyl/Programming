// Problem 22: Check Odd Number
import java.util.Scanner;

public class Program022_CheckOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(n % 2 != 0 ? "Odd" : "Not odd");
    }
}
