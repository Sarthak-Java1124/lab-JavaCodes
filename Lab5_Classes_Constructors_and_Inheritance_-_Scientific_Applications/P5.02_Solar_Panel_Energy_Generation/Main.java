class SolarPanel {
    String panelId;
    double powerRating;
    double operatingTime;

    SolarPanel(String panelId, double powerRating, double operatingTime) {
        this.panelId = panelId;
        this.powerRating = powerRating;
        this.operatingTime = operatingTime;
    }

    double calculateEnergy() {
        return powerRating * operatingTime;
    }

    void display() {
        System.out.println("Panel ID: " + panelId);
        System.out.println("Power Rating: " + powerRating + " W");
        System.out.println("Operating Time: " + operatingTime + " hours");
        System.out.println("Energy Generated: " + calculateEnergy() + " Wh");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        SolarPanel p1 = new SolarPanel("SP-101", 450, 6);
        SolarPanel p2 = new SolarPanel("SP-202", 550, 5);

        p1.display();
        p2.display();

        if (p1.calculateEnergy() > p2.calculateEnergy()) {
            System.out.println(p1.panelId + " generates more energy.");
        } else if (p2.calculateEnergy() > p1.calculateEnergy()) {
            System.out.println(p2.panelId + " generates more energy.");
        } else {
            System.out.println("Both panels generate equal energy.");
        }
    }
}
