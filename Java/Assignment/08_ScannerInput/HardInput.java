import java.util.Scanner;

class HardInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ MARK SHEET ------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Maths Mark: ");
        double maths = sc.nextDouble();

        System.out.print("Enter Physics Mark: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Mark: ");
        double chemistry = sc.nextDouble();

        double total = maths + physics + chemistry;
        double average = total / 3;

        System.out.println("\n------ MARK SHEET ------");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("\nMaths     : " + maths);
        System.out.println("Physics   : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("\nTotal     : " + total);
        System.out.println("Average   : " + average);

        sc.close();
    }
}
