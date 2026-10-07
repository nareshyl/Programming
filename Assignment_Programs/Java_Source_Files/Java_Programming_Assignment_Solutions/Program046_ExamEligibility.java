// Problem 46: Exam Eligibility
import java.util.Scanner;

public class Program046_ExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance % and marks: ");
        double attendance = sc.nextDouble(), marks = sc.nextDouble();
        System.out.println(attendance >= 75 && marks >= 40 ? "Eligible" : "Not eligible");
    }
}
