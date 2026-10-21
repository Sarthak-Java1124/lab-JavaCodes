class Railway {
    private final String[] seats = new String[3];   // null means seat is free

    synchronized void bookSeat(String passenger, int seatNo) {
        System.out.println(passenger + " is trying to book seat " + seatNo);
        if (seats[seatNo - 1] == null) {
            try {
                Thread.sleep(100);   // time taken to process the booking
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            seats[seatNo - 1] = passenger;
            System.out.println("  Seat " + seatNo + " booked for " + passenger);
        } else {
            System.out.println("  Seat " + seatNo + " already booked by " + seats[seatNo - 1]
                    + ". Booking failed for " + passenger);
        }
    }

    void showChart() {
        System.out.println("Final Reservation Chart:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("  Seat " + (i + 1) + " -> "
                    + (seats[i] == null ? "Available" : seats[i]));
        }
    }
}

class Passenger extends Thread {
    Railway railway;
    int seatNo;

    Passenger(Railway railway, String name, int seatNo) {
        super(name);
        this.railway = railway;
        this.seatNo = seatNo;
    }

    public void run() {
        railway.bookSeat(getName(), seatNo);
    }
}

public class RailwayReservation {
    public static void main(String[] args) throws InterruptedException {
        Railway railway = new Railway();
        Passenger[] passengers = {
            new Passenger(railway, "Amit", 1),
            new Passenger(railway, "Neha", 1),
            new Passenger(railway, "Ravi", 2),
            new Passenger(railway, "Priya", 2)
        };
        for (Passenger p : passengers) p.start();
        for (Passenger p : passengers) p.join();
        railway.showChart();
    }
}
