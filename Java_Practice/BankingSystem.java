import java.util.ArrayList;
import java.util.List;

/** A small console program showing OOP concepts in a banking system. */
public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("Simple Bank");

        bank.createAccount("1001", "Asha", 5_000);
        bank.createAccount("1002", "Rahul", 2_000);

        bank.deposit("1001", 1_500);
        bank.withdraw("1002", 500);
        bank.transfer("1001", "1002", 2_000);

        bank.printAllAccounts();
    }
}

class Bank {
    private final String name;
    private final List<BankAccount> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void createAccount(String accountNumber, String holderName, double openingBalance) {
        if (findAccount(accountNumber) != null) {
            System.out.println("Account number already exists.");
            return;
        }
        if (openingBalance < 0) {
            System.out.println("Opening balance cannot be negative.");
            return;
        }

        accounts.add(new BankAccount(accountNumber, holderName, openingBalance));
        System.out.println("Account created successfully for " + holderName + ".");
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        account.withdraw(amount);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount sender = findAccount(fromAccountNumber);
        BankAccount receiver = findAccount(toAccountNumber);

        if (sender == null || receiver == null) {
            System.out.println("Transfer failed: account not found.");
            return;
        }
        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            System.out.println("Transfer completed successfully.");
        }
    }

    public void printAllAccounts() {
        System.out.println("\n--- " + name + " Accounts ---");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }

    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

class BankAccount {
    private final String accountNumber;
    private final String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount);
        return true;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber
                + ", Holder: " + holderName
                + ", Balance: Rs. " + String.format("%.2f", balance);
    }
}
