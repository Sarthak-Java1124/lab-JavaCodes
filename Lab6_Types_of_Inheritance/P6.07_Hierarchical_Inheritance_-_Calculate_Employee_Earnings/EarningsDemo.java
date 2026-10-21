//          Employee
//        /    |    \
// Developer Manager Intern

class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double totalEarnings() {
        return basicSalary;
    }
}

class Developer extends Employee {
    double projectAllowance;

    Developer(String name, double basicSalary, double projectAllowance) {
        super(name, basicSalary);
        this.projectAllowance = projectAllowance;
    }

    double totalEarnings() {
        return basicSalary + projectAllowance;
    }
}

class Manager extends Employee {
    double managementAllowance;

    Manager(String name, double basicSalary, double managementAllowance) {
        super(name, basicSalary);
        this.managementAllowance = managementAllowance;
    }

    double totalEarnings() {
        return basicSalary + managementAllowance;
    }
}

class Intern extends Employee {
    double stipend;

    Intern(String name, double basicSalary, double stipend) {
        super(name, basicSalary);
        this.stipend = stipend;
    }

    double totalEarnings() {
        return basicSalary + stipend;
    }
}

public class EarningsDemo {
    public static void main(String[] args) {
        Developer d = new Developer("Aman", 50000, 8000);
        Manager m = new Manager("Sahaj", 60000, 12000);
        Intern i = new Intern("Rahul", 20000, 5000);

        System.out.println("Developer (" + d.name + ") Earnings: Rs. " + d.totalEarnings());
        System.out.println("Manager (" + m.name + ") Earnings: Rs. " + m.totalEarnings());
        System.out.println("Intern (" + i.name + ") Earnings: Rs. " + i.totalEarnings());

        Employee highest = d;
        if (m.totalEarnings() > highest.totalEarnings()) highest = m;
        if (i.totalEarnings() > highest.totalEarnings()) highest = i;
        System.out.println("Highest earner: " + highest.name);
    }
}
