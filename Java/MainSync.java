class Show{
    public synchronized void disp(String name){
        for (int i = 0; i < 5; i++) {
            System.out.println(name+" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted"+e.getMessage());
            }
        }
    }
}

class MyThread extends Thread{
    Show s1;
    String name;

    MyThread(Show s1,String name){
        this.s1 = s1;
        this.name = name;
    }

    public void run(){
        s1.disp(name);
    }
}

public class MainSync{
    public static void main(String[] args) {
        Show s1 = new Show();

        MyThread t1 = new MyThread(s1, "Allu");
        MyThread t2 = new MyThread(s1, "Arjun");

        t1.start();
        t2.start();
    }
}