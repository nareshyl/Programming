// Problem 20: Pass or Fail
import java.util.Scanner;

public class Program020_PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        System.out.println(marks >= 40 ? "Pass" : "Fail");
    }
}
