class Account {
    private double balance = 0;
    private int depositCount = 0;

    synchronized void deposit(double amount) {
        balance += amount;
        depositCount++;
    }

    double getBalance() {
        return balance;
    }

    int getDepositCount() {
        return depositCount;
    }
}

class Depositor extends Thread {
    Account account;

    Depositor(Account account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.deposit(10);
        }
        System.out.println(getName() + " finished 1000 deposits of Rs. 10");
    }
}

public class DepositCounter {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        Depositor[] counters = new Depositor[4];
        for (int i = 0; i < counters.length; i++) {
            counters[i] = new Depositor(account, "Counter-" + (i + 1));
            counters[i].start();
        }
        for (Depositor d : counters) d.join();

        System.out.println("Total deposits recorded: " + account.getDepositCount());
        System.out.println("Expected balance: Rs. 40000.0");
        System.out.println("Actual balance:   Rs. " + account.getBalance());
    }
}
