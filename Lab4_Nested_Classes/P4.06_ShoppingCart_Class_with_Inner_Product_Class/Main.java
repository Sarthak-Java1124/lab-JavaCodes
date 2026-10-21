class ShoppingCart {
    String cartOwner;
    double totalCost = 0;

    ShoppingCart(String cartOwner) {
        this.cartOwner = cartOwner;
    }

    class Product {
        String productName;
        double price;
        int quantity;

        Product(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
            totalCost += price * quantity;
            System.out.println("Added: " + productName + " (Rs. " + price + " x "
                    + quantity + ")");
        }
    }

    void showTotal() {
        System.out.println("Shopping Cart Owner: " + cartOwner);
        System.out.println("Total Cost: Rs. " + totalCost);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Priya Sharma");
        ShoppingCart.Product p1 = cart.new Product("Notebook", 60.0, 5);
        ShoppingCart.Product p2 = cart.new Product("Pen", 10.0, 10);
        cart.showTotal();
    }
}
