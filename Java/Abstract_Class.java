abstract class Animal {
    abstract void Eat();
    Animal(){
        System.out.println("Animal is Created");
    }
    abstract void Sleep();
}

abstract class Domestic extends Animal {
    abstract void cute();
    void Eat() {
        System.out.println("can eat");
    }
}

class cat extends Domestic {
    // @Override
    

    void Sleep() {
        System.out.println("can sleep");
    }

    void cute() {
        System.out.println("is cute");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        Animal c1 = new cat();
        c1.Eat();
        c1.Sleep();
        // c1.cute();
    }

}
