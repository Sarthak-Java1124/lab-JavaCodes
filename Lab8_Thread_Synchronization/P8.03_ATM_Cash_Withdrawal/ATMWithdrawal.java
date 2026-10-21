class SharedAccount {
    private double balance;

    SharedAccount(double balance) {
        this.balance = balance;
    }

    synchronized void withdraw(String atm, double amount) {
        System.out.println(atm + " requests Rs. " + amount);
        if (amount <= balance) {
            try {
                Thread.sleep(100);   // time taken to dispense cash
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println("  " + atm + ": withdrawal successful. Balance: Rs. " + balance);
        } else {
            System.out.println("  " + atm
                    + ": insufficient balance. Available: Rs. " + balance);
        }
    }

    double getBalance() {
        return balance;
    }
}

public class ATMWithdrawal {
    public static void main(String[] args) throws InterruptedException {
        SharedAccount account = new SharedAccount(10000);
        System.out.println("Initial balance: Rs. 10000.0");

        Thread atm1 = new Thread(() -> account.withdraw("ATM-1", 6000));
        Thread atm2 = new Thread(() -> account.withdraw("ATM-2", 3000));
        Thread atm3 = new Thread(() -> account.withdraw("ATM-3", 2500));

        atm1.start();
        atm2.start();
        atm3.start();
        atm1.join();
        atm2.join();
        atm3.join();

        System.out.println("Final balance: Rs. " + account.getBalance());
    }
}
