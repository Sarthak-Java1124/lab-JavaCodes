class Solution {
    String chemicalName;
    double amountOfSolute;
    double volume;

    Solution(String chemicalName, double amountOfSolute, double volume) {
        this.chemicalName = chemicalName;
        this.amountOfSolute = amountOfSolute;
        this.volume = volume;
    }

    double calculateConcentration() {
        return amountOfSolute / volume;
    }

    void display() {
        System.out.println("Chemical Name: " + chemicalName);
        System.out.println("Amount of Solute: " + amountOfSolute + " g");
        System.out.println("Volume of Solution: " + volume + " L");
        System.out.println("Concentration: " + calculateConcentration() + " g/L");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution("Sodium Chloride", 25.0, 2.5);
        Solution s2 = new Solution("Glucose", 18.0, 1.5);

        s1.display();
        s2.display();
    }
}
