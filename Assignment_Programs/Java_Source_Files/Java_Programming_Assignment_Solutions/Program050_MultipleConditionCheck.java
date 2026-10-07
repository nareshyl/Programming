// Problem 50: Multiple Condition Check
import java.util.Scanner;

public class Program050_MultipleConditionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age, salary, employment status (1 employed, 0 not): ");
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        int employed = sc.nextInt();
        // Assumed thresholds: age >= 21, salary >= 25000, employed == 1.
        System.out.println(age >= 21 && salary >= 25000 && employed == 1 ? "All conditions met" : "Conditions not met");
    }
}
