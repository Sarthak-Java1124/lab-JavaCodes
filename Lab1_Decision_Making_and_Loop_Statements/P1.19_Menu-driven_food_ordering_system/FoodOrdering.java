import java.util.Scanner;

public class FoodOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int choice;

        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Burger     - Rs. 120");
        System.out.println("2. Pizza      - Rs. 250");
        System.out.println("3. Pasta      - Rs. 180");
        System.out.println("4. Cold Drink - Rs. 60");
        System.out.println("0. Finish order");

        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            switch (choice) {
                case 1:
                    total += 120 * qty;
                    System.out.println(qty + " Burger(s) added.");
                    break;
                case 2:
                    total += 250 * qty;
                    System.out.println(qty + " Pizza(s) added.");
                    break;
                case 3:
                    total += 180 * qty;
                    System.out.println(qty + " Pasta(s) added.");
                    break;
                case 4:
                    total += 60 * qty;
                    System.out.println(qty + " Cold Drink(s) added.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        System.out.println("Total Bill: Rs. " + total);
    }
}
