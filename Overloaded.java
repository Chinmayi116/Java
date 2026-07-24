class OverloadExample {

    // Method with one integer parameter
    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    // Method with two integer parameters
    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with one double parameter
    void display(double a) {
        System.out.println("Double value: " + a);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(10);
        obj.display(10, 20);
        obj.display(15.5);
    }
}
