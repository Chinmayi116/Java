import java.util.Scanner;

class Student {
    int m1, m2, m3;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks in Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        m3 = sc.nextInt();
    }
}

class Result extends Student {

    void calculate() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}

public class InheritanceDemo {
    public static void main(String args[]) {

        Result r = new Result();

        r.getMarks();
        r.calculate();
    }
}
