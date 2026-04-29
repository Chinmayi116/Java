import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    float m1, m2, m3;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks of 3 subjects: ");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();
    }

    void calculate() {
        float total = m1 + m2 + m3;
        float percentage = total / 3;

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.calculate();
    }
}
