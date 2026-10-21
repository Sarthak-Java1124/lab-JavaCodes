class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable interface is running.");
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
