// Problem 26: Increase Salary
import java.util.Scanner;

public class Program026_IncreaseSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        salary += 1000;
        System.out.println("Updated salary = " + salary);
    }
}
