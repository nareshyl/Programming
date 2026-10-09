import java.util.Scanner;

public class Q16_SpecialOffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is customer a premium member? (true/false): ");
        boolean premium = sc.nextBoolean();

        System.out.print("Enter purchase amount: ");
        double purchase = sc.nextDouble();

        System.out.print("Is membership expired? (true/false): ");
        boolean expired = sc.nextBoolean();

        boolean eligible = (premium || purchase >= 5000) && !expired;

        if (eligible) {
            System.out.println("Customer is eligible for the special offer.");
        } else {
            System.out.println("Customer is not eligible for the special offer.");
        }
    }
}
