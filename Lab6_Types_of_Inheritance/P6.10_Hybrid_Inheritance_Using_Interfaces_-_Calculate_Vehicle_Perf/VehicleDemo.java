//              Vehicle
//            /         \
//      PetrolCar     ElectricCar
//          |               |
//   FuelEfficiency  ElectricEfficiency

class Vehicle {
    String name;
    double distance;
    double time;

    Vehicle(String name, double distance, double time) {
        this.name = name;
        this.distance = distance;
        this.time = time;
    }

    double speed() {
        return distance / time;
    }
}

interface FuelEfficiency {
    double mileage();
}

interface ElectricEfficiency {
    double energyEfficiency();
}

class PetrolCar extends Vehicle implements FuelEfficiency {
    double fuelConsumed;

    PetrolCar(String name, double distance, double time, double fuelConsumed) {
        super(name, distance, time);
        this.fuelConsumed = fuelConsumed;
    }

    public double mileage() {
        return distance / fuelConsumed;
    }
}

class ElectricCar extends Vehicle implements ElectricEfficiency {
    double electricityConsumed;

    ElectricCar(String name, double distance, double time, double electricityConsumed) {
        super(name, distance, time);
        this.electricityConsumed = electricityConsumed;
    }

    public double energyEfficiency() {
        return distance / electricityConsumed;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        PetrolCar p = new PetrolCar("Petrol Car", 300, 5, 20);
        ElectricCar e = new ElectricCar("Electric Car", 300, 5, 40);

        System.out.println(p.name + " Speed: " + p.speed() + " km/h");
        System.out.println(p.name + " Mileage: " + p.mileage() + " km/L");
        System.out.println(e.name + " Speed: " + e.speed() + " km/h");
        System.out.println(e.name + " Energy Efficiency: " + e.energyEfficiency() + " km/kWh");
    }
}
