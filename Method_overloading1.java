class Area {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Area obj = new Area();

        System.out.println("Area of Square: " + obj.area(5));
        System.out.println("Area of Rectangle: " + obj.area(6, 4));
        System.out.println("Area of Circle: " + obj.area(3.5));
    }
}
