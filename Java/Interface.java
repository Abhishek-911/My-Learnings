public class Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // Accessing the default method using the object of the implementing class
        MyInterface.defaultMethod();
        // obj.defaultMethod();
    }
}

interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
}

class MyClass implements MyInterface {
    // No need to override the default method; it's inherited automatically.
    // static void defaultMethod() {
    //     System.out.println("This is a default method in the implemented class.");
    // }
}

