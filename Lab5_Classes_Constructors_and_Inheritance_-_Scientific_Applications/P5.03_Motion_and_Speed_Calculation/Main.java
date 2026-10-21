class Motion {
    String objectName;
    double distance;
    double time;

    Motion(String objectName, double distance, double time) {
        this.objectName = objectName;
        this.distance = distance;
        this.time = time;
    }

    double calculateSpeed() {
        return distance / time;
    }

    void display() {
        System.out.println("Object Name: " + objectName);
        System.out.println("Distance: " + distance + " m");
        System.out.println("Time: " + time + " s");
        System.out.println("Speed: " + calculateSpeed() + " m/s");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Motion m1 = new Motion("Rolling Ball", 48, 6);
        Motion m2 = new Motion("Toy Car", 75, 5);

        m1.display();
        m2.display();

        if (m1.calculateSpeed() > m2.calculateSpeed()) {
            System.out.println(m1.objectName + " is faster.");
        } else if (m2.calculateSpeed() > m1.calculateSpeed()) {
            System.out.println(m2.objectName + " is faster.");
        } else {
            System.out.println("Both objects have the same speed.");
        }
    }
}
