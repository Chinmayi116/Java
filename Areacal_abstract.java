// Abstract class
abstract class Shape {
    // Abstract method
    abstract void area();
}

// Subclass for Rectangle
class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Subclass for Circle
class Circle extends Shape {
    int radius = 7;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.area();
        c.area();
    }
}
