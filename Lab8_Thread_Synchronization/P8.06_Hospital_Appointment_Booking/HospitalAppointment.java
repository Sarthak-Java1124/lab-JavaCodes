import java.util.LinkedHashMap;
import java.util.Map;

class Doctor {
    String name;
    private final Map<String, String> slots = new LinkedHashMap<>();

    Doctor(String name, String... times) {
        this.name = name;
        for (String t : times) {
            slots.put(t, null);
        }
    }

    synchronized void bookAppointment(String patient, String time) {
        if (slots.get(time) == null) {
            slots.put(time, patient);
            System.out.println(patient + " booked the " + time + " slot with " + name);
        } else {
            System.out.println(patient + " could not book " + time
                    + " - already booked by " + slots.get(time));
        }
    }

    void showSchedule() {
        System.out.println("Schedule of " + name + ":");
        for (Map.Entry<String, String> e : slots.entrySet()) {
            System.out.println("  " + e.getKey() + " -> "
                    + (e.getValue() == null ? "Free" : e.getValue()));
        }
    }
}

public class HospitalAppointment {
    public static void main(String[] args) throws InterruptedException {
        Doctor doctor = new Doctor("Dr. Mehta", "10:00 AM", "10:30 AM", "11:00 AM");

        Thread p1 = new Thread(() -> doctor.bookAppointment("Patient Arjun", "10:00 AM"));
        Thread p2 = new Thread(() -> doctor.bookAppointment("Patient Kavya", "10:00 AM"));
        Thread p3 = new Thread(() -> doctor.bookAppointment("Patient Rohan", "10:30 AM"));
        Thread p4 = new Thread(() -> doctor.bookAppointment("Patient Sneha", "10:30 AM"));

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p1.join();
        p2.join();
        p3.join();
        p4.join();

        doctor.showSchedule();
    }
}
