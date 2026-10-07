// Problem 65: Integer to Double Conversion
import java.util.Scanner;

public class Program065_IntegerToDoubleConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        double converted = n;
        System.out.println("Double value = " + converted);
    }
}
