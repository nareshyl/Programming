// Problem 58: Increment and Assignment
import java.util.Scanner;

public class Program058_IncrementAndAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        n++;
        n *= 5;
        System.out.println("Final result = " + n);
    }
}
