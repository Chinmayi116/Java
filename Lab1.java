package com.mycompany.studentrecordsystem;


import java.util.Scanner;


class Student { int id;
String name;
int marks1, marks2, marks3;


// Constructor
Student(int id, String name, int m1, int m2, int m3) { this.id = id;
this.name = name; this.marks1 = m1; this.marks2 = m2; this.marks3 = m3;
}


int calculateTotal() {
return marks1 + marks2 + marks3;
}


double calculateAverage() { return calculateTotal() / 3.0;
}


char calculateGrade() {
 
double avg = calculateAverage(); if (avg >= 90) return 'A';
else if (avg >= 75) return 'B'; else if (avg >= 60) return 'C'; else if (avg >= 35) return 'D'; else return 'F';
}


void displayRow() {
System.out.printf("%-5d %-15s %-5d %-5d %-5d %-7d %-8.2f %-5c\n", id, name, marks1, marks2, marks3,
calculateTotal(), calculateAverage(), calculateGrade());
}
}


public class StudentRecordSystem { public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Enter number of students: "); int n = sc.nextInt();

Student[] students = new Student[n];


for (int i = 0; i < n; i++) {
System.out.println("Enter details of student " + (i + 1));


System.out.print("Id: "); int id = sc.nextInt(); sc.nextLine();
 
System.out.print("Name: "); String name = sc.nextLine();

System.out.print("Marks1: "); int marks1 = sc.nextInt();

System.out.print("Marks2: "); int marks2 = sc.nextInt();

System.out.print("Marks3: "); int marks3 = sc.nextInt();

students[i] = new Student(id, name, marks1, marks2, marks3);
}


System.out.println("\n------------------------ Student Records	");


System.out.printf("%-5s %-15s %-5s %-5s %-5s %-7s %-8s %-5s\n", "Id", "Name", "M1", "M2", "M3", "Total", "Average", "Grade");

System.out.println("	");


for (Student s : students) { s.displayRow();
}


sc.close();
}
}
 


