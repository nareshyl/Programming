// Program 96: Electricity Bill with Tax
import java.util.Scanner;

public class Program096_ElectricityBillWithTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PRICE_PER_UNIT = 6.0;
        final double TAX_RATE = 0.05; // Example tax rate: 5%

        System.out.print("Enter electricity units consumed: ");
        double units = sc.nextDouble();

        double basicBill = units * PRICE_PER_UNIT;
        double tax = basicBill * TAX_RATE;
        double finalBill = basicBill + tax;

        System.out.println("Basic bill = " + basicBill);
        System.out.println("Tax = " + tax);
        System.out.println("Final bill = " + finalBill);
        sc.close();
    }
}
