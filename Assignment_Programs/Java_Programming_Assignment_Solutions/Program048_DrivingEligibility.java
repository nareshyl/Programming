// Problem 48: Driving Eligibility
import java.util.Scanner;

public class Program048_DrivingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age and licence status (true/false): ");
        int age = sc.nextInt();
        boolean hasLicence = sc.nextBoolean();
        System.out.println(age >= 18 && hasLicence ? "Eligible to drive" : "Not eligible to drive");
    }
}
