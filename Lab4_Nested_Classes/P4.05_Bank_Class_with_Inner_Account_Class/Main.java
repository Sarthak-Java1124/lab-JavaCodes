class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    class Account {
        int accountNumber;
        double balance;

        Account(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void display() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: Rs. " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Trust Bank");
        Bank.Account account = bank.new Account(781234, 125000.50);
        account.display();
    }
}
