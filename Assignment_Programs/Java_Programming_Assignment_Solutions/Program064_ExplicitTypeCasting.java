// Problem 64: Explicit Type Casting
import java.util.Scanner;

public class Program064_ExplicitTypeCasting {
    public static void main(String[] args) {
        double large = 123.987;
        int small = (int) large;
        System.out.println("double value = " + large);
        System.out.println("After casting to int = " + small);
    }
}
