// Problem 36: Employee Gross Salary
import java.util.Scanner;

public class Program036_EmployeeGrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary, HRA, and allowance: ");
        double basic = sc.nextDouble(), hra = sc.nextDouble(), allowance = sc.nextDouble();
        System.out.println("Gross salary = " + (basic + hra + allowance));
    }
}
