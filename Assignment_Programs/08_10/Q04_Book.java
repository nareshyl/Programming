public class Q04_Book {
    String title;
    double price;
    static String libraryName = "City Central Library";

    Q04_Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Library: " + libraryName);
        System.out.println();
    }

    public static void main(String[] args) {
        Q04_Book b1 = new Q04_Book("Java Programming", 450);
        Q04_Book b2 = new Q04_Book("Data Structures", 550);

        b1.display();
        b2.display();
    }
}
