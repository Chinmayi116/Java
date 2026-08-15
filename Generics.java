class GenericExample<T> {
    T value;

    GenericExample(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericExample<Integer> obj1 =
            new GenericExample<>(100);

        GenericExample<String> obj2 =
            new GenericExample<>("Java");

        obj1.display();
        obj2.display();
    }
}
