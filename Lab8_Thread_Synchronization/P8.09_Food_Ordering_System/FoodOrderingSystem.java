class Restaurant {
    private int pizzaBases = 5;
    private int cheesePackets = 4;

    synchronized void placeOrder(String customer, int pizzas) {
        System.out.println(customer + " orders " + pizzas + " pizza(s)");
        if (pizzas <= pizzaBases && pizzas <= cheesePackets) {
            pizzaBases -= pizzas;
            cheesePackets -= pizzas;
            System.out.println("  Order confirmed for " + customer
                    + ". Bases left: " + pizzaBases
                    + ", Cheese left: " + cheesePackets);
        } else {
            System.out.println("  Order rejected for " + customer
                    + " - not enough ingredients.");
        }
    }

    void showInventory() {
        System.out.println("Remaining inventory -> Pizza bases: " + pizzaBases
                + ", Cheese packets: " + cheesePackets);
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = new Restaurant();
        System.out.println("Initial inventory -> Pizza bases: 5, Cheese packets: 4");

        Thread c1 = new Thread(() -> restaurant.placeOrder("Customer Ali", 2));
        Thread c2 = new Thread(() -> restaurant.placeOrder("Customer Bina", 1));
        Thread c3 = new Thread(() -> restaurant.placeOrder("Customer Chirag", 3));
        Thread c4 = new Thread(() -> restaurant.placeOrder("Customer Divya", 1));

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c1.join();
        c2.join();
        c3.join();
        c4.join();

        restaurant.showInventory();
    }
}
