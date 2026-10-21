interface Delivery {
    void deliver(String item);
}

public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery() {
            public void deliver(String item) {
                System.out.println("Order is out for delivery...");
                System.out.println(item + " has been delivered successfully. Enjoy your meal!");
            }
        };
        delivery.deliver("Margherita Pizza");
    }
}
