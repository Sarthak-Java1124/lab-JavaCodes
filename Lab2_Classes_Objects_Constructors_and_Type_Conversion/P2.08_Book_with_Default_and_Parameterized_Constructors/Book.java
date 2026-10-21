class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(731, "Java Fundamentals", "R. Mehta", 625.0);

        System.out.println("Default Constructor Object:");
        b1.display();

        System.out.println();
        System.out.println("Parameterized Constructor Object:");
        b2.display();
    }
}
