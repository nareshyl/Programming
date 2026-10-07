// Problem 39: Electricity Bill
import java.util.Scanner;

public class Program039_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double RATE = 6.0;
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();
        System.out.println("Basic bill = " + (units * RATE));
    }
}
