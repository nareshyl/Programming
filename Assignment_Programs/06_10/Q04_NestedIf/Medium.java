import java.util.Scanner;
public class Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        int attendance = sc.nextInt();
        if (mark >= 40) {
            if (attendance >= 75) System.out.println("Passed");
            else System.out.println("Attendance is below 75%");
        } else System.out.println("Failed");
        sc.close();
    }
}