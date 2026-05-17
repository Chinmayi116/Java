class Outer {
    static class Inner {
        void display() {
            System.out.println("Static Inner Class");
        }
    }

    public static void main(String args[]) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
