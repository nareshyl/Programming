// Problem 94: Employee Payroll System
import java.util.Scanner;
public class Program094_EmployeePayrollSystem {
    static class Employee {
        int employeeId; double basicSalary;
        static final String COMPANY_CODE = "COMP001";
        Employee(int id, double salary) { employeeId=id; basicSalary=salary; }
        void payroll(double bonusPercent, double deductionPercent) {
            double bonus=basicSalary*bonusPercent/100.0;
            double gross=basicSalary+bonus;
            double deduction=gross*deductionPercent/100.0;
            System.out.println("Company: "+COMPANY_CODE+", Employee ID: "+employeeId);
            System.out.println("Basic: "+basicSalary+", Bonus: "+bonus+", Gross: "+gross);
            System.out.println("Deduction: "+deduction+", Final salary: "+(gross-deduction));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee ID, basic salary, bonus %, deduction %: ");
        int id=sc.nextInt(); double salary=sc.nextDouble(), bonus=sc.nextDouble(), deduction=sc.nextDouble();
        new Employee(id,salary).payroll(bonus,deduction);
    }
}
