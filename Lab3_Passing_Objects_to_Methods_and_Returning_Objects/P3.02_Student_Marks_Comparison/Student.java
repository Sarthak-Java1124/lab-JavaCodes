class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    static Student higherMarks(Student s1, Student s2) {
        return (s1.marks >= s2.marks) ? s1 : s2;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Sahaj", 88);
        Student s2 = new Student(2, "Aman", 82);
        Student result = higherMarks(s1, s2);
        System.out.println(result.name + " (Roll No. " + result.rollNo
                + ") has higher marks: " + result.marks);
    }
}
