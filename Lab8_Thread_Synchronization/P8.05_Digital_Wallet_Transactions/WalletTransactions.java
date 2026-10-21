class DigitalWallet {
    private double balance;

    DigitalWallet(double balance) {
        this.balance = balance;
    }

    synchronized void deposit(String user, double amount) {
        balance += amount;
        System.out.println(user + " deposited Rs. " + amount + " | Balance: Rs. " + balance);
    }

    synchronized void withdraw(String user, double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(user + " withdrew Rs. " + amount + " | Balance: Rs. " + balance);
        } else {
            System.out.println(user + " could not withdraw Rs. " + amount
                    + " (insufficient balance)");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class WalletTransactions {
    public static void main(String[] args) throws InterruptedException {
        DigitalWallet wallet = new DigitalWallet(1000);
        System.out.println("Opening balance: Rs. 1000.0");

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) wallet.deposit("Depositor", 500);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) wallet.withdraw("Spender", 400);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // 1000 + 3 x 500 - 3 x 400 = 1300
        System.out.println("Closing balance: Rs. " + wallet.getBalance());
    }
}
