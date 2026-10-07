// Problem 11: Simple Interest
import java.util.Scanner;

public class Program011_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, annual rate (%), and time (years): ");
        double p = sc.nextDouble(), r = sc.nextDouble(), time = sc.nextDouble();
        System.out.println("Simple Interest = " + (p * r * time / 100));
    }
}
