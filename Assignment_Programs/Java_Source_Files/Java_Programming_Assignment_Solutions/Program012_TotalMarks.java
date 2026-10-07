// Problem 12: Total Marks
import java.util.Scanner;

public class Program012_TotalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for three subjects: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double total = a + b + c;
        System.out.println("Total = " + total);
        System.out.println("Average = " + (total / 3));
    }
}
