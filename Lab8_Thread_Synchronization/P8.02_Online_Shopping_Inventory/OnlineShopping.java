class Inventory {
    private int stock;

    Inventory(int stock) {
        this.stock = stock;
    }

    synchronized void purchase(String customer, int quantity) {
        if (quantity <= stock) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            stock -= quantity;
            System.out.println(customer + " purchased " + quantity
                    + " unit(s). Stock left: " + stock);
        } else {
            System.out.println(customer + " wanted " + quantity + " unit(s) - only " + stock
                    + " in stock. Order rejected.");
        }
    }

    int getStock() {
        return stock;
    }
}

public class OnlineShopping {
    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = new Inventory(10);
        System.out.println("Initial stock of Smartphones: 10");

        Thread c1 = new Thread(() -> inventory.purchase("Customer-1", 4));
        Thread c2 = new Thread(() -> inventory.purchase("Customer-2", 3));
        Thread c3 = new Thread(() -> inventory.purchase("Customer-3", 5));
        Thread c4 = new Thread(() -> inventory.purchase("Customer-4", 2));

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Final stock: " + inventory.getStock());
    }
}
