import java.util.Scanner;

<<<<<<< HEAD
public class Q03_CalculateTravelCost {
=======
public class  Q03_CalculateTravelCost {
>>>>>>> e511cba ( Assignment)
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
<<<<<<< HEAD
        sc.close();
=======
>>>>>>> e511cba ( Assignment)
    }

    public static void main(String[] args) {
        calculateTravelCost();
    }
<<<<<<< HEAD
   
}

=======
}
>>>>>>> e511cba ( Assignment)
