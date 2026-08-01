class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Student Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorDemo {

    public static void main(String args[]) {

        Student s1 = new Student();

        Student s2 = new Student("Rahul");

        Student s3 = new Student("Anita", 20);
    }
}
