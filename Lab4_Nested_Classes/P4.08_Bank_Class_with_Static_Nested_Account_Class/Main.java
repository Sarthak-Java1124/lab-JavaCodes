class Bank {
    static String bankName = "Prime National Bank";

    static class Account {
        int accountNumber;
        double balance;

        Account(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void display() {
            System.out.println("Bank Name: " + Bank.bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: Rs. " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank.Account account = new Bank.Account(552011, 98750.75);
        account.display();
    }
}
