// Abstract class
abstract class Student {
    int regno;
    String name;
    int marks;

    // Abstract method
    abstract void getData(int r, String n, int m);

    abstract void display();
}

// Subclass
class StudentDetails extends Student {

    // Implement abstract method
    void getData(int r, String n, int m) {
        regno = r;
        name = n;
        marks = m;
    }

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

        // Creating objects
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        StudentDetails s3 = new StudentDetails();

        // Setting data
        s1.getData(101, "Asha", 85);
        s2.getData(102, "Ravi", 90);
        s3.getData(103, "Neha", 78);

        // Display data
        s1.display();
        s2.display();
        s3.display();
    }
}
