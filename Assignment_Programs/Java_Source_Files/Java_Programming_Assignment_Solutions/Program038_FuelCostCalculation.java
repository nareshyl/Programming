// Problem 38: Fuel Cost Calculation
import java.util.Scanner;

public class Program038_FuelCostCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km), fuel used (litres), price per litre: ");
        double distance = sc.nextDouble(), litres = sc.nextDouble(), price = sc.nextDouble();
        System.out.println("Total fuel cost = " + (litres * price));
        System.out.println("Cost per km = " + (distance > 0 ? litres * price / distance : 0));
    }
}
