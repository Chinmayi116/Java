class Person {
    void showName() {
        System.out.println("Name: suma");
    }
}

class Student extends Person {
    void showRollNo() {
        System.out.println("Roll No: 101");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.showName();
        s.showRollNo();
    }
}
