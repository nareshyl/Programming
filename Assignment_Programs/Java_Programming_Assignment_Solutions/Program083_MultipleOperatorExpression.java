// Problem 83: Multiple Operator Expression
import java.util.Scanner;

public class Program083_MultipleOperatorExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt(), e=sc.nextInt();
        int result=a+b*c-d;
        boolean condition=result>e && a!=0;
        result += condition ? e : 0;
        System.out.println("Result="+result+", condition="+condition);
    }
}
