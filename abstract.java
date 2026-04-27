// Abstract class
abstract class Animal {
    
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class using extends
class Dog extends Animal {
    
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        
        // Creating object of Dog
        Dog d = new Dog();
        
        // Calling methods
        d.sound();
        d.sleep();
    }
}
