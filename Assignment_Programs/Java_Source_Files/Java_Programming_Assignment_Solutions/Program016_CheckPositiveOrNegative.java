// Problem 16: Check Positive or Negative
import java.util.Scanner;

public class Program016_CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        System.out.println(n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");
    }
}
