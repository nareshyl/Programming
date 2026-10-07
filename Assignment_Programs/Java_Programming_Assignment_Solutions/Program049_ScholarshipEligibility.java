// Problem 49: Scholarship Eligibility
import java.util.Scanner;

public class Program049_ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks and attendance %: ");
        double marks = sc.nextDouble(), attendance = sc.nextDouble();
        System.out.println(marks >= 80 && attendance >= 75 ? "Scholarship criteria met" : "Criteria not met");
    }
}
