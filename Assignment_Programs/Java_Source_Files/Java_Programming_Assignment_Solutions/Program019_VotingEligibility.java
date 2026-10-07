// Problem 19: Voting Eligibility
import java.util.Scanner;

public class Program019_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible to vote");
    }
}
