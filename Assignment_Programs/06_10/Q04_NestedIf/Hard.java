import java.util.Scanner;
public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        int credit = sc.nextInt();
        if (age >= 18) {
            if (salary >= 30000) {
                if (credit >= 700) System.out.println("Eligible");
                else System.out.println("Credit score requirement not satisfied");
            } else System.out.println("Salary requirement not satisfied");
        } else System.out.println("Age requirement not satisfied");
        sc.close();
    }
}