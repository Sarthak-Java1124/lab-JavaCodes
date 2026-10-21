class Material {
    String materialName;
    double mass;
    double volume;

    Material(String materialName, double mass, double volume) {
        this.materialName = materialName;
        this.mass = mass;
        this.volume = volume;
    }

    double calculateDensity() {
        return mass / volume;
    }

    void display() {
        System.out.println("Material: " + materialName);
        System.out.println("Mass: " + mass + " g");
        System.out.println("Volume: " + volume + " cm^3");
        System.out.println("Density: " + calculateDensity() + " g/cm^3");
        System.out.println();
    }
}

class Metal extends Material {
    Metal(String materialName, double mass, double volume) {
        super(materialName, mass, volume);
    }
}

class Liquid extends Material {
    Liquid(String materialName, double mass, double volume) {
        super(materialName, mass, volume);
    }
}

public class Main {
    public static void main(String[] args) {
        Metal metal = new Metal("Aluminium", 540, 200);
        Liquid liquid = new Liquid("Oil", 184, 200);

        metal.display();
        liquid.display();

        if (metal.calculateDensity() > liquid.calculateDensity()) {
            System.out.println(metal.materialName + " has higher density.");
        } else {
            System.out.println(liquid.materialName + " has higher density.");
        }
    }
}
