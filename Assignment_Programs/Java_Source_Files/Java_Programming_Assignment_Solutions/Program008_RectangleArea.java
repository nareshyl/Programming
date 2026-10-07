// Problem 8: Rectangle Area
import java.util.Scanner;

public class Program008_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Area = " + (l * b));
    }
}
