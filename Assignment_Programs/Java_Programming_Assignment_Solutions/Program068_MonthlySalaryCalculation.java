// Problem 68: Monthly Salary Calculation
import java.util.Scanner;

public class Program068_MonthlySalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary, HRA, and allowance: ");
        double basic = sc.nextDouble(), hra = sc.nextDouble(), allowance = sc.nextDouble();
        System.out.println("Gross salary = " + (basic + hra + allowance));
    }
}
