class FactorialThread extends Thread {
    int n;

    FactorialThread(int n) {
        this.n = n;
    }

    public void run() {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}

class FibonacciThread extends Thread {
    int terms;

    FibonacciThread(int terms) {
        this.terms = terms;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci series (" + terms + " terms): ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class FactFiboThreads {
    public static void main(String[] args) throws InterruptedException {
        int number = 8;
        FactorialThread t1 = new FactorialThread(number);
        FibonacciThread t2 = new FibonacciThread(number);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
