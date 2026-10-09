
import java.util.Scanner;

// Abstraction
abstract class BankAccount {
    private String accountHolder;
    private long accountNumber;
    protected double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }

    // Polymorphism
    public abstract void displayAccountType();

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: Rs. %.2f%n", balance);
    }
}

// Inheritance
class SavingsAccount extends BankAccount {
    SavingsAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Current Account");
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = null;

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        long number = sc.nextLong();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Initial balance cannot be negative.");
            sc.close();
            return;
        }

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose account type: ");
        int type = sc.nextInt();

        if (type == 1) {
            account = new SavingsAccount(name, number, balance);
        } else if (type == 2) {
            account = new CurrentAccount(name, number, balance);
        } else {
            System.out.println("Invalid account type.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n--- BANKING SYSTEM ---");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.displayAccountType();
                    account.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.printf("Current balance: Rs. %.2f%n",
                            account.getBalance());
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
