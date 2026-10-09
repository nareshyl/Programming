import java.util.Scanner;

public class Q14_CityTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature of City 1: ");
        double temp1 = sc.nextDouble();

        System.out.print("Enter temperature of City 2: ");
        double temp2 = sc.nextDouble();

        if (temp1 > temp2) {
            System.out.println("City 1 has the higher temperature.");
        } else if (temp2 > temp1) {
            System.out.println("City 2 has the higher temperature.");
        } else {
            System.out.println("Both cities have equal temperatures.");
        }

        sc.close();
    }
}
