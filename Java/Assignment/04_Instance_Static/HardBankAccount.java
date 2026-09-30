class HardBankAccount {
    String accountHolder;
    double balance;
    static String bankName = "ABC Bank";

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Bank: " + bankName);
        System.out.println("Balance: ₹" + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        HardBankAccount a1 = new HardBankAccount();
        HardBankAccount a2 = new HardBankAccount();
        HardBankAccount a3 = new HardBankAccount();

        a1.accountHolder = "Ravi";
        a1.balance = 5000;
        a2.accountHolder = "Arun";
        a2.balance = 8000;
        a3.accountHolder = "Kumar";
        a3.balance = 10000;

        a1.deposit(2000);
        a1.withdraw(1000);
        a2.deposit(3000);
        a2.withdraw(2000);
        a3.deposit(5000);
        a3.withdraw(2500);

        a1.display();
        a2.display();
        a3.display();
    }
}
