// Problem 89: Employee Instance and Static Variables
import java.util.Scanner;

public class Program089_EmployeeInstanceAndStaticVariables {
    public static void main(String[] args) {
        class Employee {
            int id; double salary; static String companyCode = "COMP001";
            Employee(int id, double salary) { this.id = id; this.salary = salary; }
        }
        Employee e1 = new Employee(1, 30000), e2 = new Employee(2, 40000);
        System.out.println(e1.id + " " + e1.salary + " " + Employee.companyCode);
        System.out.println(e2.id + " " + e2.salary + " " + Employee.companyCode);
    }
}
