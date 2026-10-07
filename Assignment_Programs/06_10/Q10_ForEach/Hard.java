import java.util.Scanner;
public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) numbers[i] = sc.nextInt();
        int largest = numbers[0], smallest = numbers[0];
        for (int n : numbers) {
            if (n > largest) largest = n;
            if (n < smallest) smallest = n;
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        sc.close();
    }
}