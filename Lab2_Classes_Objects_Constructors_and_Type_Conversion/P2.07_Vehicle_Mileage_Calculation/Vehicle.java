class Vehicle {
    int distance;
    float fuelConsumed;

    Vehicle(int distance, float fuelConsumed) {
        this.distance = distance;
        this.fuelConsumed = fuelConsumed;
    }

    void calculateMileage() {
        double distanceInDouble = distance;         // implicit conversion
        double mileage = distanceInDouble / fuelConsumed;
        int roundedMileage = (int) mileage;         // explicit casting

        System.out.println("Distance: " + distance + " km");
        System.out.println("Fuel Consumed: " + fuelConsumed + " L");
        System.out.println("Mileage: " + mileage + " km/L");
        System.out.println("Explicitly Cast Mileage: " + roundedMileage + " km/L");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(527, 38.5f);
        v.calculateMileage();
    }
}
