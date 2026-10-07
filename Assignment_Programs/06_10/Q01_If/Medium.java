import java.util.Scanner;
public class Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Eligible for driving");
        sc.close();
    }
}