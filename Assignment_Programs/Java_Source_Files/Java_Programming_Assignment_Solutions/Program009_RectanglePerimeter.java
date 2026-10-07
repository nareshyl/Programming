// Problem 9: Rectangle Perimeter
import java.util.Scanner;

public class Program009_RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Perimeter = " + (2 * (l + b)));
    }
}
