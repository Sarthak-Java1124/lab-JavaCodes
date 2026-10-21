class ElectricityBill {
    int units;

    ElectricityBill(int units) {
        this.units = units;
    }

    void calculateBill() {
        double consumedUnits = units;     // int converted to double
        double bill = consumedUnits * 6.25;

        System.out.println("Units Consumed: " + units);
        System.out.println("Rate per Unit: Rs. 6.25");
        System.out.println("Electricity Bill: Rs. " + bill);
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill(184);
        eb.calculateBill();
    }
}
