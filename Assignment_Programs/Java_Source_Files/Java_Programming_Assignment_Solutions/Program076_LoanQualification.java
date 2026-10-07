// Problem 76: Loan Qualification
import java.util.Scanner;

public class Program076_LoanQualification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age, monthly salary, employment duration (years), existing loan amount: ");
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        double loan = sc.nextDouble();
        // Assumed criteria because the assignment does not specify thresholds.
        System.out.println(age >= 21 && age <= 60 && salary >= 25000 && years >= 2 && loan <= 500000
                ? "Meets assumed loan criteria" : "Does not meet assumed loan criteria");
    }
}
