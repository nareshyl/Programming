public class Q06_Vehicle {
    String vehicleNumber;
    String ownerName;
    static String registrationOffice = "Chennai RTO";

    Q06_Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Registration Office: " + registrationOffice);
        System.out.println();
    }

    public static void main(String[] args) {
        Q06_Vehicle v1 = new Q06_Vehicle("TN01AB1234", "Arun");
        Q06_Vehicle v2 = new Q06_Vehicle("TN02CD5678", "Kumar");
        Q06_Vehicle v3 = new Q06_Vehicle("TN03EF9012", "Ravi");

        v1.display();
        v2.display();
        v3.display();
    }
}
