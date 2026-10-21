class Recharge {
    long mobileNumber;
    int rechargeAmount;
    double gst;

    Recharge(long mobileNumber, int rechargeAmount, double gst) {
        this.mobileNumber = mobileNumber;
        this.rechargeAmount = rechargeAmount;
        this.gst = gst;
    }

    void calculatePayable() {
        double amount = rechargeAmount;      // int converted to double
        double gstAmount = amount * gst / 100;
        double finalAmount = amount + gstAmount;

        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Recharge Amount: Rs. " + amount);
        System.out.printf("GST (%.0f%%): Rs. %.2f%n", gst, gstAmount);
        System.out.printf("Final Payable Amount: Rs. %.2f%n", finalAmount);
    }

    public static void main(String[] args) {
        Recharge r = new Recharge(9876543210L, 699, 18);
        r.calculatePayable();
    }
}
