class Calculation extends Thread {
    int a, b;
    char op;

    Calculation(String name, int a, int b, char op) {
        super(name);
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public void run() {
        switch (op) {
            case '+':
                System.out.println(getName() + ": " + a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(getName() + ": " + a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(getName() + ": " + a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(getName() + ": " + a + " / " + b + " = " + ((double) a / b));
                break;
        }
    }
}

public class ArithmeticThreads {
    public static void main(String[] args) throws InterruptedException {
        int a = 20, b = 5;
        Calculation add = new Calculation("Addition Thread", a, b, '+');
        Calculation sub = new Calculation("Subtraction Thread", a, b, '-');
        Calculation mul = new Calculation("Multiplication Thread", a, b, '*');
        Calculation div = new Calculation("Division Thread", a, b, '/');

        add.start();
        add.join();
        sub.start();
        sub.join();
        mul.start();
        mul.join();
        div.start();
        div.join();
    }
}
