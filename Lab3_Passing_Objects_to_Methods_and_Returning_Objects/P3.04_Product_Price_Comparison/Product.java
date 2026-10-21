class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    static Product expensive(Product p1, Product p2) {
        return (p1.price >= p2.price) ? p1 : p2;
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 65000);
        Product p2 = new Product(102, "Tablet", 30000);
        Product result = expensive(p1, p2);
        System.out.println(result.productName + " is more expensive: Rs. " + result.price);
    }
}
