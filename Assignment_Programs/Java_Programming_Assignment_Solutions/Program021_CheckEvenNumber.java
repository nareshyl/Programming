// Problem 21: Check Even Number
import java.util.Scanner;

public class Program021_CheckEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Not even");
    }
}
