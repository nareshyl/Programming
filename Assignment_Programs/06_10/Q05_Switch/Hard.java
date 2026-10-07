import java.util.Scanner;
public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice != 4) {
            int n = sc.nextInt();
            switch (choice) {
                case 1:
                    if (n >= 0) System.out.println("Positive");
                    else System.out.println("Negative");
                    break;
                case 2:
                    if (n % 2 == 0) System.out.println("Even");
                    else System.out.println("Odd");
                    break;
                case 3:
                    System.out.println("Square = " + (n * n));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            sc.close();
        }
    }
}