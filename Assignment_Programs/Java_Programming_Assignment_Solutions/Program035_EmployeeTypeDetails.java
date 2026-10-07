// Problem 35: Employee Type Details
public class Program035_EmployeeTypeDetails {
    static class Employee {
        int employeeId, age, departmentNumber;
        double salary;
        Employee(int id, int age, double salary, int dept) {
            this.employeeId = id; this.age = age; this.salary = salary; this.departmentNumber = dept;
        }
        void display() {
            System.out.println("ID: " + employeeId + ", Age: " + age + ", Salary: " + salary + ", Department: " + departmentNumber);
        }
    }
    public static void main(String[] args) {
        Employee e = new Employee(1001, 25, 35000, 10);
        e.display();
    }
}
