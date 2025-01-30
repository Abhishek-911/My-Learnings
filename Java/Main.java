class DaemonThread extends Thread{
    public void run(){
        int count = 1;
        while(true){
            System.out.println(Thread.currentThread().getName()+" "+count+" is running in the Background");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted"+e.getMessage());
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread();
        d1.setName("Daemon");
        System.out.println(d1.isDaemon());
        d1.setDaemon(true);
        d1.start();

        System.out.println("Main Thread started running!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted"+e.getMessage());
        }
        System.out.println("Main Thread finished running!");
    }
}