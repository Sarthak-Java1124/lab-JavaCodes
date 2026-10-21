// Product
//    |
// DiscountProduct
//    |
// FinalProduct

class Product {
    String name;
    double originalPrice;

    Product(String name, double originalPrice) {
        this.name = name;
        this.originalPrice = originalPrice;
    }
}

class DiscountProduct extends Product {
    double discountPercent;

    DiscountProduct(String name, double originalPrice, double discountPercent) {
        super(name, originalPrice);
        this.discountPercent = discountPercent;
    }

    double discount() {
        return originalPrice * discountPercent / 100;
    }

    double discountedPrice() {
        return originalPrice - discount();
    }
}

class FinalProduct extends DiscountProduct {
    double taxPercent;

    FinalProduct(String name, double originalPrice, double discountPercent, double taxPercent) {
        super(name, originalPrice, discountPercent);
        this.taxPercent = taxPercent;
    }

    double tax() {
        return discountedPrice() * taxPercent / 100;
    }

    double finalPrice() {
        return discountedPrice() + tax();
    }

    public static void main(String[] args) {
        FinalProduct p = new FinalProduct("Laptop", 60000, 10, 18);

        System.out.println("Product: " + p.name);
        System.out.println("Original Price: Rs. " + p.originalPrice);
        System.out.println("Discount (" + p.discountPercent + "%): Rs. " + p.discount());
        System.out.println("Discounted Price: Rs. " + p.discountedPrice());
        System.out.println("Tax (" + p.taxPercent + "%): Rs. " + p.tax());
        System.out.println("Final Price: Rs. " + p.finalPrice());
    }
}
