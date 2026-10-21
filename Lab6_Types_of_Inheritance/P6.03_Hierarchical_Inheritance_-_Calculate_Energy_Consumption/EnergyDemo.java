//        Appliance
//       /    |    \
//     Fan  Light   AC

class Appliance {
    String name;
    double power;
    double hours;

    Appliance(String name, double power, double hours) {
        this.name = name;
        this.power = power;
        this.hours = hours;
    }

    double energy() {
        return power * hours;
    }

    void display() {
        System.out.println(name + ": " + power + " W x " + hours + " h = " + energy() + " Wh");
    }
}

class Fan extends Appliance {
    Fan(double power, double hours) {
        super("Fan", power, hours);
    }
}

class Light extends Appliance {
    Light(double power, double hours) {
        super("Light", power, hours);
    }
}

class AC extends Appliance {
    AC(double power, double hours) {
        super("AC", power, hours);
    }
}

public class EnergyDemo {
    public static void main(String[] args) {
        Appliance[] appliances = { new Fan(75, 8), new Light(20, 6), new AC(1500, 5) };

        Appliance highest = appliances[0];
        for (Appliance a : appliances) {
            a.display();
            if (a.energy() > highest.energy()) {
                highest = a;
            }
        }
        System.out.println("Highest energy consumption: " + highest.name);
    }
}
