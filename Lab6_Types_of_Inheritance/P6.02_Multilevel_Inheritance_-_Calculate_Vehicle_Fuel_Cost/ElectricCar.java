// Vehicle
//    |
//   Car
//    |
// ElectricCar

class Vehicle {
    String vehicleName;
    double distance;

    Vehicle(String vehicleName, double distance) {
        this.vehicleName = vehicleName;
        this.distance = distance;
    }
}

class Car extends Vehicle {
    double fuelConsumed;

    Car(String vehicleName, double distance, double fuelConsumed) {
        super(vehicleName, distance);
        this.fuelConsumed = fuelConsumed;
    }

    double mileage() {
        return distance / fuelConsumed;
    }
}

class ElectricCar extends Car {
    double electricityConsumed;
    double electricityRate;

    ElectricCar(String vehicleName, double distance, double fuelConsumed,
                double electricityConsumed, double electricityRate) {
        super(vehicleName, distance, fuelConsumed);
        this.electricityConsumed = electricityConsumed;
        this.electricityRate = electricityRate;
    }

    double chargingCost() {
        return electricityConsumed * electricityRate;
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Hybrid Sedan", 300, 20, 45, 8);
        System.out.println("Vehicle Name: " + e.vehicleName);
        System.out.println("Distance: " + e.distance + " km");
        System.out.println("Fuel Consumed: " + e.fuelConsumed + " L");
        System.out.println("Mileage: " + e.mileage() + " km/L");
        System.out.println("Electricity Consumed: " + e.electricityConsumed + " kWh");
        System.out.println("Electricity Rate: Rs. " + e.electricityRate + " per kWh");
        System.out.println("Charging Cost: Rs. " + e.chargingCost());
    }
}
