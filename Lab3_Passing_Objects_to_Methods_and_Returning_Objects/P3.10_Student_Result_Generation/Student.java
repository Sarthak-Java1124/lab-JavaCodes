class Student {
    int rollNo;
    String name;
    double marks1, marks2, marks3;
    double total, percentage;

    Student(int rollNo, String name, double marks1, double marks2, double marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    static Student result(Student s) {
        Student r = new Student(s.rollNo, s.name, s.marks1, s.marks2, s.marks3);
        r.total = s.marks1 + s.marks2 + s.marks3;
        r.percentage = r.total / 3;
        return r;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Sahaj", 85, 90, 88);
        Student r = result(s);
        System.out.println("Name: " + r.name + " (Roll No. " + r.rollNo + ")");
        System.out.println("Total Marks = " + r.total);
        System.out.printf("Percentage = %.2f%%%n", r.percentage);
    }
}
