class Employee {
    int employeeId;
    String name;
    double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    static void compareSalary(Employee e1, Employee e2) {
        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " (ID " + e1.employeeId
                    + ") has the higher salary: Rs. " + e1.salary);
        } else if (e2.salary > e1.salary) {
            System.out.println(e2.name + " (ID " + e2.employeeId
                    + ") has the higher salary: Rs. " + e2.salary);
        } else {
            System.out.println("Both employees have the same salary.");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sahaj", 50000);
        Employee e2 = new Employee(102, "Rahul", 45000);
        compareSalary(e1, e2);
    }
}
