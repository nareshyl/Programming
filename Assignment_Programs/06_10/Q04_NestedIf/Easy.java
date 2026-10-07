import java.util.Scanner;
public class Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int ticket = sc.nextInt();
        if (age >= 18) {
            if (ticket == 1) System.out.println("Eligible");
            else System.out.println("Ticket required");
        } else System.out.println("Not eligible by age");
        sc.close();
    }
}