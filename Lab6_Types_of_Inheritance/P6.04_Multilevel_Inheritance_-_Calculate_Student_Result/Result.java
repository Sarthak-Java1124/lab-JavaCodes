// Student
//    |
//  Marks
//    |
//  Result

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks extends Student {
    double marks1, marks2, marks3;

    Marks(String name, int rollNo, double marks1, double marks2, double marks3) {
        super(name, rollNo);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double totalMarks() {
        return marks1 + marks2 + marks3;
    }
}

class Result extends Marks {
    static final double MAX_MARKS = 300;

    Result(String name, int rollNo, double marks1, double marks2, double marks3) {
        super(name, rollNo, marks1, marks2, marks3);
    }

    double percentage() {
        return (totalMarks() / MAX_MARKS) * 100;
    }

    public static void main(String[] args) {
        Result r = new Result("Sahaj", 101, 85, 90, 88);
        System.out.println("Student Name: " + r.name);
        System.out.println("Roll Number: " + r.rollNo);
        System.out.println("Total Marks: " + r.totalMarks() + " / " + MAX_MARKS);
        System.out.printf("Percentage: %.2f%%%n", r.percentage());
    }
}
