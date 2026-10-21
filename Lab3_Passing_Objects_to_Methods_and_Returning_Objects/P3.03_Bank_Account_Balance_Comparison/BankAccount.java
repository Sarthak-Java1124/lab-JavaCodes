class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    static BankAccount greaterBalance(BankAccount a1, BankAccount a2) {
        return (a1.balance >= a2.balance) ? a1 : a2;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1001, "Sahaj", 75000);
        BankAccount a2 = new BankAccount(1002, "Aman", 60000);
        BankAccount result = greaterBalance(a1, a2);
        System.out.println("Account " + result.accountNo + " (" + result.holderName
                + ") has greater balance: Rs. " + result.balance);
    }
}
