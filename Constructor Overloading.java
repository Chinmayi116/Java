class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(int x) {
        System.out.println("Value = " + x);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10);
    }
}
