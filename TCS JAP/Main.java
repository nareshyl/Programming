import java.util.ArrayList;
import java.util.List;

// =========================
// Movie Class
// =========================
class Movie {
    int movieID;
    String title;
    String genre;
    int duration;

    Movie(int movieID, String title, String genre, int duration) {
        this.movieID = movieID;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    void updateMovie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    void displayMovie() {
        System.out.println("Movie ID : " + movieID);
        System.out.println("Title    : " + title);
        System.out.println("Genre    : " + genre);
        System.out.println("Duration : " + duration + " minutes");
    }
}


// =========================
// Customer Class
// =========================
class Customer {
    int customerID;
    String name;
    List<Booking> bookedTickets;

    Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.bookedTickets = new ArrayList<>();
    }

    void updateCustomer(String name) {
        this.name = name;
    }

    void addBooking(Booking booking) {
        bookedTickets.add(booking);
    }

    void displayCustomer() {
        System.out.println("Customer ID : " + customerID);
        System.out.println("Name        : " + name);
        System.out.println("Bookings    : " + bookedTickets.size());
    }
}


// =========================
// Booking Class
// =========================
class Booking {
    int bookingID;
    Customer customer;
    Movie movie;
    int seats;
    double totalAmount;

    Booking(int bookingID, Customer customer, Movie movie,
            int seats, double totalAmount) {

        this.bookingID = bookingID;
        this.customer = customer;
        this.movie = movie;
        this.seats = seats;
        this.totalAmount = totalAmount;
    }

    void updateBooking(int seats, double totalAmount) {
        this.seats = seats;
        this.totalAmount = totalAmount;
    }

    void displayBooking() {
        System.out.println("Booking ID   : " + bookingID);
        System.out.println("Customer     : " + customer.name);
        System.out.println("Movie        : " + movie.title);
        System.out.println("Seats        : " + seats);
        System.out.println("Total Amount : ₹" + totalAmount);
    }
}


// =========================
// Theater Class
// =========================
class Theater {

    List<Movie> movies;
    List<Customer> customers;
    List<Booking> bookings;

    Theater() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    // Add Movie
    void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added successfully.");
    }

    // Add Customer
    void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added successfully.");
    }

    // Book Tickets
    void bookTickets(Booking booking) {
        bookings.add(booking);
        booking.customer.addBooking(booking);

        System.out.println("Tickets booked successfully.");
    }

    // Display All Movies
    void displayAllMovies() {

        System.out.println("\n========== ALL MOVIES ==========");

        for (Movie movie : movies) {
            movie.displayMovie();
            System.out.println("-------------------------------");
        }
    }

    // Display All Customers
    void displayAllCustomers() {

        System.out.println("\n======== ALL CUSTOMERS =========");

        for (Customer customer : customers) {
            customer.displayCustomer();
            System.out.println("-------------------------------");
        }
    }

    // Display All Bookings
    void displayAllBookings() {

        System.out.println("\n========= ALL BOOKINGS =========");

        for (Booking booking : bookings) {
            booking.displayBooking();
            System.out.println("-------------------------------");
        }
    }
}


// =========================
// Main Class
// =========================
public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater();

        // -------------------------
        // Add Movies
        // -------------------------

        Movie movie1 = new Movie(
                101,
                "Interstellar",
                "Sci-Fi",
                169
        );

        Movie movie2 = new Movie(
                102,
                "Inception",
                "Thriller",
                148
        );

        theater.addMovie(movie1);
        theater.addMovie(movie2);


        // -------------------------
        // Add Customers
        // -------------------------

        Customer customer1 = new Customer(
                201,
                "Naresh"
        );

        Customer customer2 = new Customer(
                202,
                "Arun"
        );

        theater.addCustomer(customer1);
        theater.addCustomer(customer2);


        // -------------------------
        // Create Bookings
        // -------------------------

        Booking booking1 = new Booking(
                301,
                customer1,
                movie1,
                2,
                300.00
        );

        Booking booking2 = new Booking(
                302,
                customer2,
                movie2,
                3,
                450.00
        );


        // -------------------------
        // Book Tickets
        // -------------------------

        theater.bookTickets(booking1);
        theater.bookTickets(booking2);


        // -------------------------
        // Display Details
        // -------------------------

        theater.displayAllMovies();

        theater.displayAllCustomers();

        theater.displayAllBookings();
    }
}