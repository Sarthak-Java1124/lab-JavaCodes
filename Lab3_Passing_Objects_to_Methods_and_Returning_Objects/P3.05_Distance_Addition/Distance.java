class Distance {
    int feet, inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    static Distance add(Distance d1, Distance d2) {
        int totalInches = d1.inches + d2.inches;
        int totalFeet = d1.feet + d2.feet + totalInches / 12;
        totalInches = totalInches % 12;
        return new Distance(totalFeet, totalInches);
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 7);
        Distance result = add(d1, d2);
        System.out.println("Distance 1 = " + d1.feet + " feet " + d1.inches + " inches");
        System.out.println("Distance 2 = " + d2.feet + " feet " + d2.inches + " inches");
        System.out.println("Result = " + result.feet + " feet " + result.inches + " inches");
    }
}
