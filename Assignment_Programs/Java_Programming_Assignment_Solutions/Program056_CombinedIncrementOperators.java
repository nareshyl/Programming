// Problem 56: Combined Increment Operators
import java.util.Scanner;

public class Program056_CombinedIncrementOperators {
    public static void main(String[] args) {
        int a = 5, b = 5;
        System.out.println("a before = " + a + ", ++a = " + (++a) + ", after = " + a);
        System.out.println("b before post-increment = " + b);
        System.out.println("b++ result = " + (b++));
        System.out.println("b after = " + b);
    }
}
