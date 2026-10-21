import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        if (maths >= 60) {
            if (physics >= 50) {
                if (chemistry >= 40) {
                    int total = maths + physics + chemistry;
                    if (total >= 180 || maths + physics >= 130) {
                        System.out.println("Total marks: " + total);
                        System.out.println("Candidate is eligible for admission.");
                    } else {
                        System.out.println("Not eligible: total marks criteria not met.");
                    }
                } else {
                    System.out.println("Not eligible: Chemistry marks below 40.");
                }
            } else {
                System.out.println("Not eligible: Physics marks below 50.");
            }
        } else {
            System.out.println("Not eligible: Maths marks below 60.");
        }
    }
}
