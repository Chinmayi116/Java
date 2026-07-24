class Multiply {

    void multiply(int a, int b) {
        System.out.println("Product = " + (a * b));
    }

    void multiply(int a, int b, int c) {
        System.out.println("Product = " + (a * b * c));
    }

    public static void main(String[] args) {
        Multiply obj = new Multiply();

        obj.multiply(5, 4);
        obj.multiply(2, 3, 4);
    }
}
