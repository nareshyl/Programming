// Problem 40: Shopping Bill
import java.util.Scanner;

public class Program040_ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prices of three products: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Total bill = " + (a + b + c));
    }
}
