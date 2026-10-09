import java.util.Scanner;

public class Q17_EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);
    }
}
