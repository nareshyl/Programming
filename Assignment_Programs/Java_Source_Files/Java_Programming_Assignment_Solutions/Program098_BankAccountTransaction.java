// Program 98: Bank Account Transaction
import java.util.Scanner;

public class Program098_BankAccountTransaction {
    static class BankAccount {
        double balance;
        static final String BANK_CODE = "BANK001";

        BankAccount(double openingBalance) {
            balance = openingBalance;
        }

        void transact(double deposit, double withdrawal) {
            if (deposit < 0 || withdrawal < 0) {
                System.out.println("Deposit and withdrawal must not be negative.");
                return;
            }
            if (withdrawal > balance + deposit) {
                System.out.println("Transaction rejected: insufficient balance.");
                return;
            }
            balance += deposit;
            balance -= withdrawal;
            System.out.println("Bank code = " + BANK_CODE);
            System.out.println("Final balance = " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opening balance, deposit, and withdrawal: ");
        double opening = sc.nextDouble();
        double deposit = sc.nextDouble();
        double withdrawal = sc.nextDouble();

        BankAccount account = new BankAccount(opening);
        account.transact(deposit, withdrawal);
        sc.close();
    }
}
