// Program 100: Student Result System
import java.util.Scanner;

public class Program100_StudentResultSystem {
    static class Student {
        int rollNumber;
        double mark1, mark2, mark3;

        Student(int rollNumber, double mark1, double mark2, double mark3) {
            this.rollNumber = rollNumber;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        double total() {
            return mark1 + mark2 + mark3;
        }

        double average() {
            return total() / 3.0;
        }

        boolean passed() {
            return mark1 >= 40 && mark2 >= 40 && mark3 >= 40;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number and marks for three subjects: ");
        int roll = sc.nextInt();
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        Student student = new Student(roll, m1, m2, m3);
        System.out.println("Roll number = " + student.rollNumber);
        System.out.println("Total marks = " + student.total());
        System.out.println("Average marks = " + student.average());
        System.out.println("Result = " + (student.passed() ? "Pass" : "Fail"));
        sc.close();
    }
}
