// Problem 86: Employee Object Comparison
import java.util.Scanner;

public class Program086_EmployeeObjectComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first roll number and marks, then second roll number and marks: ");
        int r1=sc.nextInt(); double m1=sc.nextDouble(); int r2=sc.nextInt(); double m2=sc.nextDouble();
        if(m1>m2) System.out.println("Student "+r1+" has higher marks.");
        else if(m2>m1) System.out.println("Student "+r2+" has higher marks.");
        else System.out.println("Both students have equal marks.");
    }
}
