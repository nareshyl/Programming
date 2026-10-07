// flight reservation system
import java.util.ArrayList;
import java.util.List;

// =====================================
// Base Class: Flight
// =====================================
class Flight {
    protected int flightID;
    protected String flightNumber;
    protected int capacity;

    Flight(int flightID, String flightNumber, int capacity) {
        this.flightID = flightID;
        this.flightNumber = flightNumber;
        this.capacity = capacity;
    }

    void displayDetails() {
        System.out.println("Flight ID     : " + flightID);
        System.out.println("Flight Number : " + flightNumber);
        System.out.println("Capacity      : " + capacity);
    }
}


// =====================================
// Derived Class: DomesticFlight
// =====================================
class DomesticFlight extends Flight {

    private String destination;

    DomesticFlight(int flightID, String flightNumber,
                   int capacity, String destination) {

        super(flightID, flightNumber, capacity);
        this.destination = destination;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Destination   : " + destination);
    }
}


// =====================================
// Derived Class: InternationalFlight
// =====================================
class InternationalFlight extends Flight {

    private String country;

    InternationalFlight(int flightID, String flightNumber,
                        int capacity, String country) {

        super(flightID, flightNumber, capacity);
        this.country = country;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Country       : " + country);
    }
}


// =====================================
// Airline Reservation System
// =====================================
class AirlineReservationSystem {

    private List<Flight> flights;

    AirlineReservationSystem() {
        flights = new ArrayList<>();
    }

    // Add a normal flight
    void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Add a domestic flight
    void addDomesticFlight(DomesticFlight flight) {
        flights.add(flight);
    }

    // Add an international flight
    void addInternationalFlight(InternationalFlight flight) {
        flights.add(flight);
    }

    // Display all flights
    void displayAllFlights() {

        System.out.println("\n========== ALL FLIGHTS ==========");

        for (Flight flight : flights) {
            flight.displayDetails();
            System.out.println("-------------------------------");
        }
    }
}


// =====================================
// Main Class
// =====================================
public class Main1{

    public static void main(String[] args) {

        AirlineReservationSystem system =
                new AirlineReservationSystem();

        // Normal Flight
        Flight flight1 = new Flight(
                101,
                "AI101",
                180
        );

        // Domestic Flight
        DomesticFlight flight2 = new DomesticFlight(
                102,
                "6E202",
                186,
                "Chennai"
        );

        // International Flight
        InternationalFlight flight3 = new InternationalFlight(
                103,
                "AI303",
                250,
                "Singapore"
        );

        // Add flights
        system.addFlight(flight1);
        system.addDomesticFlight(flight2);
        system.addInternationalFlight(flight3);

        // Display flights
        system.displayAllFlights();
    }
}