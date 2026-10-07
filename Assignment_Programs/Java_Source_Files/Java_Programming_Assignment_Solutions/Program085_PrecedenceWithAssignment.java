// Problem 85: Precedence with Assignment
import java.util.Scanner;

public class Program085_PrecedenceWithAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        System.out.println("a+b*c = "+(a+b*c));
        System.out.println("(a+b)*c = "+((a+b)*c));
        System.out.println("a-b/c = "+(c==0 ? "undefined (division by zero)" : String.valueOf(a-b/c)));
    }
}
