// Program 97: Employee Salary Revision
import java.util.Scanner;

public class Program097_EmployeeSalaryRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary, bonus %, and deduction %: ");
        double basicSalary = sc.nextDouble();
        double bonusPercent = sc.nextDouble();
        double deductionPercent = sc.nextDouble();

        double bonus = basicSalary * bonusPercent / 100.0;
        double grossSalary = basicSalary + bonus;
        double deduction = grossSalary * deductionPercent / 100.0;
        double finalSalary = grossSalary - deduction;

        System.out.println("Bonus = " + bonus);
        System.out.println("Gross salary = " + grossSalary);
        System.out.println("Deduction = " + deduction);
        System.out.println("Final salary = " + finalSalary);
        sc.close();
    }
}
