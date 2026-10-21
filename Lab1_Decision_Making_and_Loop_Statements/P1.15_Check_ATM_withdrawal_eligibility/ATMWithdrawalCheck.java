import java.util.Scanner;

public class ATMWithdrawalCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        if (withdraw <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            if (withdraw <= balance) {
                if (withdraw % 100 == 0) {
                    System.out.println("Withdrawal approved. New balance: "
                            + (balance - withdraw));
                } else {
                    System.out.println("Amount must be in multiples of 100.");
                }
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }
}
