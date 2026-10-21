import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();
        double bonusPercent;

        if (years >= 5) {
            if (salary >= 50000) {
                bonusPercent = 10;
            } else {
                bonusPercent = 15;
            }
        } else {
            if (years >= 2) {
                bonusPercent = 5;
            } else {
                bonusPercent = 0;
            }
        }

        double bonus = salary * bonusPercent / 100;
        System.out.println("Bonus Percentage: " + bonusPercent + "%");
        System.out.println("Bonus Amount: Rs. " + bonus);
    }
}
