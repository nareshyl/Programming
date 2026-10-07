// Program 95: Employee Salary Calculation
import java.util.Scanner;

public class Program095_EmployeeSalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary, HRA %, allowance %, bonus %, deduction %: ");
        double basic = sc.nextDouble();
        double hraPercent = sc.nextDouble();
        double allowancePercent = sc.nextDouble();
        double bonusPercent = sc.nextDouble();
        double deductionPercent = sc.nextDouble();

        double hra = basic * hraPercent / 100.0;
        double allowance = basic * allowancePercent / 100.0;
        double gross = basic + hra + allowance;
        double bonus = gross * bonusPercent / 100.0;
        double deduction = (gross + bonus) * deductionPercent / 100.0;
        double finalSalary = gross + bonus - deduction;

        System.out.println("HRA = " + hra);
        System.out.println("Allowance = " + allowance);
        System.out.println("Gross salary = " + gross);
        System.out.println("Bonus = " + bonus);
        System.out.println("Deduction = " + deduction);
        System.out.println("Final salary = " + finalSalary);
        sc.close();
    }
}
