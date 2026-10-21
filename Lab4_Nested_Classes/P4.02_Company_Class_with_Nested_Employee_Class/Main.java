class Company {
    String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    class Employee {
        String empName;
        int empId;
        String designation;

        Employee(String empName, int empId, String designation) {
            this.empName = empName;
            this.empId = empId;
            this.designation = designation;
        }

        void display() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee ID: " + empId);
            System.out.println("Designation: " + designation);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechNova Solutions");
        Company.Employee employee = company.new Employee("Rohit Verma", 501,
                "Software Engineer");
        employee.display();
    }
}
