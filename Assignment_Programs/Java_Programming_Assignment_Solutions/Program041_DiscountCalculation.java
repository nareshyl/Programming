// Problem 41: Discount Calculation
import java.util.Scanner;

public class Program041_DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price and discount percentage: ");
        double price = sc.nextDouble(), percent = sc.nextDouble();
        double discount = price * percent / 100;
        System.out.println("Discount = " + discount);
        System.out.println("Final price = " + (price - discount));
    }
}
