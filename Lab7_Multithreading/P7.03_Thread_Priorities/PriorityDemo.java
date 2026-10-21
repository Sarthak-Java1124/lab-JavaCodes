class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class PriorityDemo {
    public static void main(String[] args) throws InterruptedException {
        PriorityThread t1 = new PriorityThread("Thread-Low");
        PriorityThread t2 = new PriorityThread("Thread-Normal");
        PriorityThread t3 = new PriorityThread("Thread-High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
