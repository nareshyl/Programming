import java.util.Scanner;
public class Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        do {
            n = sc.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println("Sum = " + sum);
        sc.close();
    }
}