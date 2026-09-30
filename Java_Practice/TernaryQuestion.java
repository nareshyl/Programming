import java.util.Scanner;

public class TernaryQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();
        String result = (mark >= 40) ? "Pass" : "Fail";

        System.out.println(result);
    }
}