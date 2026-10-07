// Problem 27: Reduce Marks
import java.util.Scanner;

public class Program027_ReduceMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        marks -= 5;
        System.out.println("Updated marks = " + marks);
    }
}
