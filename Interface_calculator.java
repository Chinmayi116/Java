interface Calculator {
    int add(int a, int b);
}

class MyCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.println("Sum = " + calc.add(10, 20));
    }
}
