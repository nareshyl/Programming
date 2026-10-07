// Problem 88: Vehicle Object Classification
public class Program088_VehicleTypeIdentification {
    static class Vehicle {}
    static class Car extends Vehicle {}
    static class Bike extends Vehicle {}
    static class Bus extends Vehicle {}
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike(), new Bus() };
        for (Vehicle v : vehicles) {
            if (v instanceof Car) System.out.println("Car");
            else if (v instanceof Bike) System.out.println("Bike");
            else if (v instanceof Bus) System.out.println("Bus");
            else System.out.println("Unknown vehicle");
        }
    }
}
