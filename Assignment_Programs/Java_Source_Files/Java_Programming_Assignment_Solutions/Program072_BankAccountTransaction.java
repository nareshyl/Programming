// Problem 72: Bank Account Transaction
import java.util.Scanner;
public class Program072_BankAccountTransaction {
    static class BankAccount {
        double balance;
        static final String BANK_CODE = "BK001";
        BankAccount(double balance) { this.balance = balance; }
        void transact(double deposit, double withdrawal) {
            if (deposit < 0 || withdrawal < 0 || withdrawal > balance + deposit) {
                System.out.println("Invalid transaction."); return;
            }
            balance += deposit; balance -= withdrawal;
            System.out.println("Bank code: " + BANK_CODE + ", Final balance: " + balance);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Opening balance, deposit, withdrawal: ");
        double b = sc.nextDouble(), d = sc.nextDouble(), w = sc.nextDouble();
        new BankAccount(b).transact(d, w);
    }
}
