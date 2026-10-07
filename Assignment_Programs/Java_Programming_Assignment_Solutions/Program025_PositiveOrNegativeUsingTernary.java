// Problem 25: Positive or Negative Using Ternary
import java.util.Scanner;

public class Program025_PositiveOrNegativeUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        System.out.println(n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");
    }
}
