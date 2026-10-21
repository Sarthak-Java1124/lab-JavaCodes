//           Shape
//       /     |     \
//   Circle Rectangle Triangle

class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double area() {
        return 0;
    }

    void displayInfo() {
        System.out.printf("Shape: %-10s Area: %.2f%n", name, area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(7), new Rectangle(10, 5), new Triangle(8, 6) };

        Shape largest = shapes[0];
        for (Shape s : shapes) {
            s.displayInfo();
            if (s.area() > largest.area()) {
                largest = s;
            }
        }
        System.out.println("Largest area: " + largest.name);
    }
}
