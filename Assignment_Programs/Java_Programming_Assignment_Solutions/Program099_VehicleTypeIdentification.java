// Program 99: Vehicle Type Identification
public class Program099_VehicleTypeIdentification {
    static class Vehicle { }
    static class Car extends Vehicle { }
    static class Bike extends Vehicle { }

    public static void main(String[] args) {
        Vehicle first = new Car();
        Vehicle second = new Bike();

        if (first instanceof Car) {
            System.out.println("First object is a Car.");
        } else if (first instanceof Bike) {
            System.out.println("First object is a Bike.");
        }

        if (second instanceof Car) {
            System.out.println("Second object is a Car.");
        } else if (second instanceof Bike) {
            System.out.println("Second object is a Bike.");
        }
    }
}
