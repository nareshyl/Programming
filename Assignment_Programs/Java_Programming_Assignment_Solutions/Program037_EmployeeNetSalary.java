// Problem 37: Employee Net Salary
import java.util.Scanner;

public class Program037_EmployeeNetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary, bonus, and deduction: ");
        double basic = sc.nextDouble(), bonus = sc.nextDouble(), deduction = sc.nextDouble();
        System.out.println("Net salary = " + (basic + bonus - deduction));
    }
}
