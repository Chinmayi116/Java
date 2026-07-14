interface Vehicle {
    default void start() {
        System.out.println("Vehicle Started");
    }
}

class Car implements Vehicle {
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
