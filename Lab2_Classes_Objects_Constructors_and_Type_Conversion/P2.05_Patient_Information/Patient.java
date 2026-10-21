class Patient {
    int patientId;
    String name;
    int age;
    double consultationFee;

    Patient(int patientId, String name, int age, double consultationFee) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.consultationFee = consultationFee;
    }

    void displayInformation() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Consultation Fee: Rs. " + consultationFee);
    }

    public static void main(String[] args) {
        Patient p = new Patient(512, "Raj", 19, 750.0);
        p.displayInformation();
    }
}
