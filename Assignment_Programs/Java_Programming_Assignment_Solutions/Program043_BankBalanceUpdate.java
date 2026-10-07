// Problem 43: Bank Balance Update
import java.util.Scanner;

public class Program043_BankBalanceUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opening balance, deposit, and withdrawal: ");
        double balance = sc.nextDouble(), deposit = sc.nextDouble(), withdrawal = sc.nextDouble();
        balance += deposit;
        if (withdrawal >= 0 && withdrawal <= balance) {
            balance -= withdrawal;
            System.out.println("Transaction successful. Final balance = " + balance);
        } else System.out.println("Transaction rejected: invalid withdrawal.");
    }
}
