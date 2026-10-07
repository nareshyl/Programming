import java.util.Scanner;
public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if (n < 0) continue;
            sum += n;
        }
        System.out.println("Sum of positive numbers = " + sum);
        sc.close();
    }
}