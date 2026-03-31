interface Animal {
    void sound();   // abstract method
}

// Dog class
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
