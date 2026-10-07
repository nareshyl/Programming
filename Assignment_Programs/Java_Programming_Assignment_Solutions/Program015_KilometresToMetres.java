// Problem 15: Kilometres to Metres
import java.util.Scanner;

public class Program015_KilometresToMetres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometres: ");
        double km = sc.nextDouble();
        System.out.println("Metres = " + (km * 1000));
    }
}
