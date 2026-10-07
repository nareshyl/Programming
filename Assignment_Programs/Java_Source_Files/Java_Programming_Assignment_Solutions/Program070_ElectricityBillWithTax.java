// Problem 70: Electricity Bill with Tax
import java.util.Scanner;

public class Program070_ElectricityBillWithTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double RATE = 6.0;
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();
        System.out.println("Basic bill = " + (units * RATE));
    }
}
