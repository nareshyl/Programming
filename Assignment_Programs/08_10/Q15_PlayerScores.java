import java.util.Scanner;

public class Q15_PlayerScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score of Player 1: ");
        int a = sc.nextInt();
        System.out.print("Enter score of Player 2: ");
        int b = sc.nextInt();
        System.out.print("Enter score of Player 3: ");
        int c = sc.nextInt();

        if (a != b && b != c && a != c) {
            System.out.println("All scores are different.");
        } else {
            System.out.println("At least two scores are equal.");
        }

        if (a == b || b == c || a == c) {
            System.out.println("Any two scores are equal.");
        }

        int highest = Math.max(a, Math.max(b, c));
        System.out.println("Highest score = " + highest);
    }
}
