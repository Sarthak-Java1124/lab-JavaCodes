class ParkingLot {
    private final int capacity;
    private int parked = 0;

    ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    synchronized boolean park(String vehicle) {
        if (parked < capacity) {
            parked++;
            System.out.println(vehicle + " parked. Occupied: " + parked + "/" + capacity);
            return true;
        }
        System.out.println(vehicle + " denied entry - parking lot is full.");
        return false;
    }

    synchronized void leave(String vehicle) {
        parked--;
        System.out.println(vehicle + " left. Occupied: " + parked + "/" + capacity);
    }
}

class Vehicle extends Thread {
    ParkingLot lot;

    Vehicle(ParkingLot lot, String name) {
        super(name);
        this.lot = lot;
    }

    public void run() {
        if (lot.park(getName())) {
            try {
                Thread.sleep(200);   // time spent parked
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            lot.leave(getName());
        }
    }
}

public class ParkingManagement {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot lot = new ParkingLot(3);
        System.out.println("Parking capacity: 3");

        Vehicle[] vehicles = new Vehicle[5];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = new Vehicle(lot, "Car-" + (i + 1));
            vehicles[i].start();
        }
        for (Vehicle v : vehicles) v.join();
    }
}
