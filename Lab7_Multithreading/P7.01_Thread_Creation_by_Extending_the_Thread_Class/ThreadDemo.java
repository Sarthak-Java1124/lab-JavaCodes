class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class is running.");
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
