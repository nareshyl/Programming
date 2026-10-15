import java.util.Scanner;

public class Q03_CalculateTravelCost {
    static void calculateTravelCost() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter fuel efficiency (km/litre): ");
        double efficiency = sc.nextDouble();
        System.out.print("Enter fuel price per litre: ");
        double fuelPrice = sc.nextDouble();
        System.out.print("Enter parking cost: ");
        double parking = sc.nextDouble();

        double fuelUsed = distance / efficiency;
        double fuelCost = fuelUsed * fuelPrice;
        double totalCost = fuelCost + parking;

        System.out.println("Fuel Cost = " + fuelCost);
        System.out.println("Total Travel Cost = " + totalCost);
        sc.close();
    }

    public static void main(String[] args) {
        calculateTravelCost();
    }
   
}

