// Hybrid inheritance structure:
//              Device
//             /      \
//  HouseholdDevice   OfficeDevice
//         |               |
//      SmartFan        Printer

class Device {
    String deviceName;
    double power;
    double time;

    Device(String deviceName, double power, double time) {
        this.deviceName = deviceName;
        this.power = power;
        this.time = time;
    }

    double calculateEnergy() {
        return power * time;
    }

    void display() {
        System.out.println("Device: " + deviceName);
    }
}

class HouseholdDevice extends Device {
    HouseholdDevice(String deviceName, double power, double time) {
        super(deviceName, power, time);
    }

    void display() {
        System.out.println("Household Device: " + deviceName);
        System.out.println("Power: " + power + " W");
        System.out.println("Operating Time: " + time + " hours");
        System.out.println("Energy Consumed: " + calculateEnergy() + " Wh");
        System.out.println();
    }
}

class OfficeDevice extends Device {
    OfficeDevice(String deviceName, double power, double time) {
        super(deviceName, power, time);
    }

    void display() {
        System.out.println("Office Device: " + deviceName);
        System.out.println("Power: " + power + " W");
        System.out.println("Operating Time: " + time + " hours");
        System.out.println("Energy Consumed: " + calculateEnergy() + " Wh");
        System.out.println();
    }
}

class SmartFan extends HouseholdDevice {
    SmartFan(String deviceName, double power, double time) {
        super(deviceName, power, time);
    }
}

class Printer extends OfficeDevice {
    Printer(String deviceName, double power, double time) {
        super(deviceName, power, time);
    }
}

public class Main {
    public static void main(String[] args) {
        SmartFan fan = new SmartFan("Smart Ceiling Fan", 70, 8);
        Printer printer = new Printer("Laser Printer", 400, 2);

        fan.display();
        printer.display();

        if (fan.calculateEnergy() > printer.calculateEnergy()) {
            System.out.println(fan.deviceName + " consumes more energy.");
        } else {
            System.out.println(printer.deviceName + " consumes more energy.");
        }
    }
}
