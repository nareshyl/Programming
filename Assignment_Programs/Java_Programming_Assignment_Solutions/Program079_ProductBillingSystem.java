// Problem 79: Product Billing System
import java.util.Scanner;

public class Program079_ProductBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price, quantity, discount %, tax %: ");
        double price=sc.nextDouble(), qty=sc.nextDouble(), discountPct=sc.nextDouble(), taxPct=sc.nextDouble();
        double subtotal=price*qty, discount=subtotal*discountPct/100, taxable=subtotal-discount;
        double tax=taxable*taxPct/100;
        System.out.println("Subtotal="+subtotal+", Discount="+discount+", Tax="+tax+", Final bill="+(taxable+tax));
    }
}
