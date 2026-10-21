class Company {
    String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    static class Department {
        String departmentName;
        int employeeCount;

        Department(String departmentName, int employeeCount) {
            this.departmentName = departmentName;
            this.employeeCount = employeeCount;
        }

        void display() {
            System.out.println("Department Name: " + departmentName);
            System.out.println("Employee Count: " + employeeCount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Nimbus Technologies");
        System.out.println("Company Name: " + company.companyName);

        Company.Department department = new Company.Department("Research and Development", 45);
        department.display();
    }
}
