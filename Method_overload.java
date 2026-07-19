class Display {

    void show() {
        System.out.println("Welcome!");
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Display obj = new Display();

        obj.show();
        obj.show("Chinmayi");
        obj.show("Chinmayi", 21);
    }
}
