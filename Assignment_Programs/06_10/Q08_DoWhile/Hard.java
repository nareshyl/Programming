import java.util.Scanner;
public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                switch (choice) {
                    case 1: System.out.println(a + b); break;
                    case 2: System.out.println(a - b); break;
                    case 3: System.out.println(a * b); break;
                    case 4: System.out.println(a / b); break;
                }
            }
        } while (choice != 5);
        sc.close();
    }
}