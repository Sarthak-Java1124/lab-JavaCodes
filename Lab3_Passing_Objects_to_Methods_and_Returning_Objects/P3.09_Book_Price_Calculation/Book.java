class Book {
    int bookId, quantity;
    String title;
    double price;

    Book(int bookId, String title, double price, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    static Book totalPrice(Book b) {
        return new Book(b.bookId, b.title, b.price * b.quantity, b.quantity);
    }

    public static void main(String[] args) {
        Book b = new Book(101, "Java Programming", 500, 3);
        Book result = totalPrice(b);
        System.out.println("Book: " + b.title);
        System.out.println("Price per copy: Rs. " + b.price);
        System.out.println("Quantity: " + b.quantity);
        System.out.println("Total Price = Rs. " + result.price);
    }
}
