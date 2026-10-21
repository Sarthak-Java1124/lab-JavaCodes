class Complex {
    int real, imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(3, 2);
        Complex result = add(c1, c2);
        System.out.println("(" + c1.real + " + " + c1.imaginary + "i) + (" + c2.real
                + " + " + c2.imaginary
                + "i) = " + result.real + " + " + result.imaginary + "i");
    }
}
