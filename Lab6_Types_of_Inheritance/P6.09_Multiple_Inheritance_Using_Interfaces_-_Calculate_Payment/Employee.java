// Salary (interface)   Bonus (interface)
//            \            /
//              Employee

interface Salary {
    double BASIC_SALARY = 50000;

    double calculateSalary();
}

interface Bonus {
    double BONUS_AMOUNT = 10000;

    double calculateBonus();
}

class Employee implements Salary, Bonus {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return BASIC_SALARY;
    }

    public double calculateBonus() {
        return BONUS_AMOUNT;
    }

    double totalIncome() {
        return calculateSalary() + calculateBonus();
    }

    public static void main(String[] args) {
        Employee e = new Employee("Sahaj");

        System.out.println("Employee: " + e.name);
        System.out.println("Salary: Rs. " + e.calculateSalary());
        System.out.println("Bonus: Rs. " + e.calculateBonus());
        System.out.println("Total Income: Rs. " + e.totalIncome());
    }
}
