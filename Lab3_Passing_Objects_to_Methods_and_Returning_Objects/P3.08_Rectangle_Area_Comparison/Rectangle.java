class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    static Rectangle largerArea(Rectangle r1, Rectangle r2) {
        return (r1.area() >= r2.area()) ? r1 : r2;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(8, 7);
        System.out.println("Rectangle 1 area: " + r1.area());
        System.out.println("Rectangle 2 area: " + r2.area());
        Rectangle result = largerArea(r1, r2);
        System.out.println("Larger rectangle: " + result.length + " x "
                + result.breadth + " (area " + result.area() + ")");
    }
}
