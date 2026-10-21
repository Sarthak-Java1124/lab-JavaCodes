class BankAccount {
    long accountNumber;
    String holderName;
    double balance;

    BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Final Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(78451236L, "Sahaj", 28500);
        account.deposit(4500);
        account.withdraw(2750);
        account.displayBalance();
    }
}
