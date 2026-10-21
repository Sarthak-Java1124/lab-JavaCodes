class Hospital {
    String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    class Doctor {
        String doctorName;
        String specialization;

        Doctor(String doctorName, String specialization) {
            this.doctorName = doctorName;
            this.specialization = specialization;
        }

        void display() {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Doctor Name: " + doctorName);
            System.out.println("Specialization: " + specialization);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Centre Hospital");
        Hospital.Doctor doctor = hospital.new Doctor("Dr. Raj", "Cardiologist");
        doctor.display();
    }
}
