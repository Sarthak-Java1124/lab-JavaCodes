class ExamHall {
    private final String[] seats;
    private int nextSeat = 0;

    ExamHall(int totalSeats) {
        seats = new String[totalSeats];
    }

    synchronized void allocateSeat(String student) {
        if (nextSeat < seats.length) {
            seats[nextSeat] = student;
            System.out.println(Thread.currentThread().getName()
                    + " allocated seat S" + (nextSeat + 1) + " to " + student);
            nextSeat++;
        } else {
            System.out.println(Thread.currentThread().getName()
                    + ": no seat left for " + student);
        }
    }

    void showAllocation() {
        System.out.println("Final Seat Allocation:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("  S" + (i + 1) + " -> "
                    + (seats[i] == null ? "Empty" : seats[i]));
        }
    }
}

public class ExamSeatAllocation {
    public static void main(String[] args) throws InterruptedException {
        ExamHall hall = new ExamHall(5);

        Thread desk1 = new Thread(() -> {
            hall.allocateSeat("Aarav");
            hall.allocateSeat("Bhavya");
            hall.allocateSeat("Chetan");
        }, "Desk-1");
        Thread desk2 = new Thread(() -> {
            hall.allocateSeat("Diya");
            hall.allocateSeat("Eshan");
            hall.allocateSeat("Farah");
        }, "Desk-2");

        desk1.start();
        desk2.start();
        desk1.join();
        desk2.join();

        hall.showAllocation();
    }
}
