import java.util.Scanner;

public class Q02_CalculateSalary {
    static void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        double da = sc.nextDouble();
        System.out.print("Enter Deductions: ");
        double deductions = sc.nextDouble();

        double netSalary = basic + hra + da - deductions;
        System.out.println("Net Salary = " + netSalary);
    }

    public static void main(String[] args) {
        calculateSalary();
    }
}
