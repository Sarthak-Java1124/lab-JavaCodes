// Employee
//    |
// Manager

class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    double totalSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        Manager m = new Manager("Raj", 50000, 10000);
        m.displayDetails();
        System.out.println("Bonus: " + m.bonus);
        System.out.println("Total Salary: " + m.totalSalary());
    }
}
