// Problem 87: Student Object Comparison
import java.util.Scanner;
public class Program087_StudentResultSystem {
    static class Student {
        int rollNumber; double m1, m2, m3;
        Student(int roll, double a, double b, double c) { rollNumber=roll; m1=a; m2=b; m3=c; }
        double total() { return m1+m2+m3; }
        double average() { return total()/3; }
        boolean passed() { return m1>=40 && m2>=40 && m3>=40; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll number and three subject marks: ");
        int roll=sc.nextInt(); double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
        Student s=new Student(roll,a,b,c);
        System.out.println("Roll: "+s.rollNumber+", Total: "+s.total()+", Average: "+s.average());
        System.out.println(s.passed() ? "Pass" : "Fail");
    }
}
