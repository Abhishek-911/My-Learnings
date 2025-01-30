class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start();
        try {
            t1.join(); // Main thread waits for t1 to complete
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start(); // Only after t1 finishes, t2 starts
    }
}
