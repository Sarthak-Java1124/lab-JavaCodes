interface Payment {
    void pay(double amount);
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment() {
            public void pay(double amount) {
                System.out.println("Processing payment...");
                System.out.println("Payment of Rs. " + amount + " completed successfully.");
            }
        };
        payment.pay(2500.00);
    }
}
