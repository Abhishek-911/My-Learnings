class MyRunnable implements Runnable{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" -Count "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted"+e.getMessage());
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();

        Thread thread1 = new Thread(m1,"Thread1");
        Thread thread2 = new Thread(m1,"Thread2");

        thread1.start();
        thread2.start();
    }
}
