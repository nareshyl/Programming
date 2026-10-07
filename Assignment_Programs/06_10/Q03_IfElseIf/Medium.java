import java.util.Scanner;
public class Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark >= 90 && mark <= 100) System.out.println("A");
        else if (mark >= 75) System.out.println("B");
        else if (mark >= 60) System.out.println("C");
        else if (mark >= 40) System.out.println("D");
        else System.out.println("F");
        sc.close();
    }
}