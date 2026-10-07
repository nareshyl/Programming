// Problem 30: Decrement Number
import java.util.Scanner;

public class Program030_DecrementNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("After decrement = " + (--n));
    }
}
