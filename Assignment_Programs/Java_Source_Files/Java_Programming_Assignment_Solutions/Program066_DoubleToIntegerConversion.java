// Problem 66: Double to Integer Conversion
import java.util.Scanner;

public class Program066_DoubleToIntegerConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double n = sc.nextDouble();
        int converted = (int) n;
        System.out.println("Integer value = " + converted);
    }
}
