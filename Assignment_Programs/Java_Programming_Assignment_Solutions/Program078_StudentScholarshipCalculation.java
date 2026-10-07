// Problem 78: Student Scholarship Calculation
import java.util.Scanner;

public class Program078_StudentScholarshipCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks, attendance %, family income: ");
        double marks=sc.nextDouble(), attendance=sc.nextDouble(), income=sc.nextDouble();
        // Assumed criteria because the statement gives no thresholds.
        System.out.println(marks>=80 && attendance>=75 && income<=250000 ? "Scholarship criteria met" : "Criteria not met");
    }
}
