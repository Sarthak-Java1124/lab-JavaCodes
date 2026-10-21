class Employee {
    int employeeId;
    String name;
    int basicPay;

    Employee(int employeeId, String name, int basicPay) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicPay = basicPay;
    }

    void calculateSalary() {
        double basic = basicPay;          // int converted to double
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double monthly = basic + hra + da;
        double annual = monthly * 12;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Monthly Salary: " + monthly);
        System.out.println("Annual Salary: " + annual);
    }

    public static void main(String[] args) {
        Employee e = new Employee(307, "Sahaj", 42000);
        e.calculateSalary();
    }
}
