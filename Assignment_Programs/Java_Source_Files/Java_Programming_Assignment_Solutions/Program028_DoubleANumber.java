// Problem 28: Double a Number
import java.util.Scanner;

public class Program028_DoubleANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        n *= 2;
        System.out.println("Doubled value = " + n);
    }
}
