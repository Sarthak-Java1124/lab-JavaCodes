class MovieHall {
    private final int totalSeats;
    private int bookedSeats = 0;

    MovieHall(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    synchronized void bookTickets(String user, int tickets) {
        int available = totalSeats - bookedSeats;
        if (tickets <= available) {
            bookedSeats += tickets;
            System.out.println(user + " booked " + tickets
                    + " ticket(s). Seats left: " + (totalSeats - bookedSeats));
        } else {
            System.out.println(user + " requested " + tickets + " ticket(s) - only " + available
                    + " seat(s) left. Booking failed.");
        }
    }

    int getBookedSeats() {
        return bookedSeats;
    }
}

class User extends Thread {
    MovieHall hall;
    int tickets;

    User(MovieHall hall, String name, int tickets) {
        super(name);
        this.hall = hall;
        this.tickets = tickets;
    }

    public void run() {
        hall.bookTickets(getName(), tickets);
    }
}

public class MovieBooking {
    public static void main(String[] args) throws InterruptedException {
        MovieHall hall = new MovieHall(8);
        System.out.println("Total seats available: 8");

        User[] users = {
            new User(hall, "User-A", 3),
            new User(hall, "User-B", 4),
            new User(hall, "User-C", 2),
            new User(hall, "User-D", 1)
        };
        for (User u : users) u.start();
        for (User u : users) u.join();

        System.out.println("Total tickets booked: " + hall.getBookedSeats());
    }
}
