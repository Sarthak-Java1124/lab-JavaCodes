// Conceptual structure:      Student
//                           /       \
//                    Academic       Sports
//                           \       /
//                          Scholarship
// Java does not allow a class to extend two classes, so Academic is a class
// and Sports is an interface; Scholarship extends Academic and implements Sports.

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Academic extends Student {
    double marksObtained;
    double maxMarks;

    Academic(String name, int rollNo, double marksObtained, double maxMarks) {
        super(name, rollNo);
        this.marksObtained = marksObtained;
        this.maxMarks = maxMarks;
    }

    double academicPercentage() {
        return marksObtained / maxMarks * 100;
    }
}

interface Sports {
    double sportsScore();
}

class Scholarship extends Academic implements Sports {
    double sportsScore;

    Scholarship(String name, int rollNo, double marksObtained, double maxMarks,
            double sportsScore) {
        super(name, rollNo, marksObtained, maxMarks);
        this.sportsScore = sportsScore;
    }

    public double sportsScore() {
        return sportsScore;
    }

    boolean isEligible() {
        return academicPercentage() >= 75 && sportsScore() >= 70;
    }

    public static void main(String[] args) {
        Scholarship s = new Scholarship("Sahaj", 101, 410, 500, 75);

        System.out.println("Student Name: " + s.name);
        System.out.println("Roll Number: " + s.rollNo);
        System.out.println("Academic Percentage: " + s.academicPercentage() + "%");
        System.out.println("Sports Score: " + s.sportsScore());
        System.out.println("Scholarship Eligible: " + (s.isEligible() ? "Yes" : "No"));
    }
}
