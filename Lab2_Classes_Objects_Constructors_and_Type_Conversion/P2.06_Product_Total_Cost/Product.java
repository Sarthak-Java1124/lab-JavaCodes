class Product {
    int productId;
    String name;
    int quantity;
    double price;

    Product(int productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void calculateTotal() {
        double convertedQuantity = quantity;   // implicit int to double
        double totalCost = convertedQuantity * price;

        System.out.println("Product ID: " + productId);
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs. " + price);
        System.out.println("Total Cost: Rs. " + totalCost);
    }

    public static void main(String[] args) {
        Product p = new Product(418, "Wireless Mouse", 7, 849.50);
        p.calculateTotal();
    }
}
