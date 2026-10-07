import java.util.Scanner;
public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        int search = sc.nextInt();
        boolean found = false;
        for (int n : numbers) {
            if (n == search) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Element found");
        else System.out.println("Element not found");
        sc.close();
    }
}