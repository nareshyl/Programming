public class Q05_Mobile {
    String model;
    double price;
    static String brand = "Samsung";

    Q05_Mobile(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Q05_Mobile m1 = new Q05_Mobile("Galaxy A35", 22999);
        Q05_Mobile m2 = new Q05_Mobile("Galaxy A36", 25999);
        Q05_Mobile m3 = new Q05_Mobile("Galaxy S24", 69999);

        m1.display();
        m2.display();
        m3.display();
    }
}
