class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class NumberDemo {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}
