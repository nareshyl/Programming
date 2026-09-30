import java.util.Scanner;

class EasyInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
