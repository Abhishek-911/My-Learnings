interface A{
    void run();
    void jump();
    public static void implementation1(){
        System.out.println("Inside Implementation1 method of Interface A");
    }
    public default void implementation2(){
        System.out.println("Inside Implementation2 method of Interface A");
    }
}

class Check implements A{
    public void run(){
        System.out.println("Implementing run method");
    }
    public void jump(){
        System.out.println("Implementing jump method");
    }
    // public default void implementation2(){
    //     System.out.println("Inside Implementation2 method of class Check");
    // }
    // public static void implementation1(){
    //     System.out.println("Inside Implementation1 method of  class Check");
    // }
}

public class interface_method {
    public static void main(String[] args) {
        Check c1 = new Check();
        c1.run();
        c1.jump();
        c1.implementation2();
        A.implementation1();
    }
}
