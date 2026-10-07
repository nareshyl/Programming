// Problem 14: Celsius to Fahrenheit
import java.util.Scanner;

public class Program014_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + (c * 9 / 5 + 32));
    }
}
