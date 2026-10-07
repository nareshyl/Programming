import java.util.Scanner;
public class Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 1, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}