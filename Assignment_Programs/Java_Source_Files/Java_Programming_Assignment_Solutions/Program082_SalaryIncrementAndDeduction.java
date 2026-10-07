// Problem 82: Salary Increment and Deduction
import java.util.Scanner;

public class Program082_SalaryIncrementAndDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary, increment %, bonus %, deduction %: ");
        double salary = sc.nextDouble(), inc = sc.nextDouble(), bonus = sc.nextDouble(), deduction = sc.nextDouble();
        double revised = salary + salary * inc / 100;
        double bonusAmount = revised * bonus / 100;
        double deductionAmount = (revised + bonusAmount) * deduction / 100;
        System.out.println("Final salary = " + (revised + bonusAmount - deductionAmount));
    }
}
