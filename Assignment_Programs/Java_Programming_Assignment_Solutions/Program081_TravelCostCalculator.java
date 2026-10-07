// Problem 81: Travel Cost Calculator
import java.util.Scanner;

public class Program081_TravelCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance km, efficiency km/l, fuel price/l, toll, parking: ");
        double distance=sc.nextDouble(), efficiency=sc.nextDouble(), price=sc.nextDouble(), toll=sc.nextDouble(), parking=sc.nextDouble();
        if (efficiency <= 0) System.out.println("Fuel efficiency must be positive.");
        else { double fuel=distance/efficiency; System.out.println("Fuel required="+fuel+" L, Total cost=₹"+(fuel*price+toll+parking)); }
    }
}
