// Abstract class
abstract class Student {
    int regno;
    String name;
    int marks;

    // Constructor
    Student(int r, String n, int m) {
        regno = r;
        name = n;
        marks = m;
    }

    // Abstract method
    abstract void display();
}

// Subclass
class StudentDetails extends Student {

    // Constructor of subclass
    StudentDetails(int r, String n, int m) {
        super(r, n, m);
    }

    // Implement display method
    void display() {
        System.out.println("Reg No: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating objects using constructor
        StudentDetails s1 = new StudentDetails(101, "Asha", 85);
        StudentDetails s2 = new StudentDetails(102, "Ravi", 90);
        StudentDetails s3 = new StudentDetails(103, "Neha", 78);

        // Display details
        s1.display();
        s2.display();
        s3.display();
    }
}
