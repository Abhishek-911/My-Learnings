abstract class Animal {
    abstract void sound(); // Abstract method
    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}

abstract class Mammal extends Animal {
    abstract void habitat(); // New abstract method
    
    // void sound() { // Partial implementation of the parent abstract method
    //     System.out.println("Mammals make sounds.");
    // }
}

class Dog extends Mammal {
    @Override
    void habitat() {
        System.out.println("Dogs live on land.");
    }

    @Override
    void sound() {
        System.out.println("Dogs bark.");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();   // Output: Dogs bark.
        dog.eat();     // Output: This animal eats food.
        dog.habitat(); // Output: Dogs live on land.
    }
}
