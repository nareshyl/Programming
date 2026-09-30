import java.util.Scanner;

class MediumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Maths Mark: ");
        double maths = sc.nextDouble();

        System.out.print("Enter Science Mark: ");
        double science = sc.nextDouble();

        System.out.print("Enter English Mark: ");
        double english = sc.nextDouble();

        double total = maths + science + english;
        double average = total / 3;

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        sc.close();
    }
}
