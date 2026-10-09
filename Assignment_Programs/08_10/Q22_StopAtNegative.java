import java.util.Scanner;

public class Q22_StopAtNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            System.out.println("You entered: " + number);
        }

        System.out.println("Negative number entered. Program stopped.");
        sc.close();
    }
}
