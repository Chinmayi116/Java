import java.sql.*;
import java.util.Scanner;
public class StudentCRUD {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String url = "jdbc:mysql://localhost:3306/studentdb";
 String username = "root";
 String password = "";
 try {
 Connection con = DriverManager.getConnection(url, username, password);
 Statement stmt = con.createStatement();
 int choice;
 do {
 System.out.println("\n===== STUDENT CRUD MENU =====");
 System.out.println("1. Insert Student");
 System.out.println("2. View Students");
 System.out.println("3. Update Student");
 System.out.println("4. Delete Student");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
choice = sc.nextInt();
 switch (choice) {
 // CREATE
 case 1:
 System.out.print("Enter ID: ");
 int id = sc.nextInt();
 sc.nextLine(); // consume newline
 System.out.print("Enter Name: ");
 String name = sc.nextLine();
 System.out.print("Enter Age: ");
 int age = sc.nextInt();
 String insertQuery =
 "INSERT INTO students VALUES(" +
 id + ", '" + name + "', " + age + ")";
 int inserted = stmt.executeUpdate(insertQuery);
 System.out.println(inserted + " record inserted.");
 break;
 // READ
 case 2:
 ResultSet rs = stmt.executeQuery("SELECT * FROM students");
 System.out.println("\nID\tNAME\tAGE");
while (rs.next()) {
 System.out.println(
 rs.getInt("id") + "\t" +
 rs.getString("name") + "\t" +
 rs.getInt("age")
 );
 }
 rs.close();
 break;
 // UPDATE
 case 3:
 System.out.print("Enter Student ID to update: ");
 int updateId = sc.nextInt();
 System.out.print("Enter New Age: ");
 int newAge = sc.nextInt();
 String updateQuery =
 "UPDATE students SET age=" +
 newAge + " WHERE id=" + updateId;
 int updated = stmt.executeUpdate(updateQuery);
 System.out.println(updated + " record updated.");
 break;
 // DELETE
 case 4:
 System.out.print("Enter Student ID to delete: ");
 int deleteId = sc.nextInt();
String deleteQuery =
 "DELETE FROM students WHERE id=" + deleteId;
 int deleted = stmt.executeUpdate(deleteQuery);
 System.out.println(deleted + " record deleted.");
 break;
 case 5:
 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice!");
 }
 } while (choice != 5);
 stmt.close();
 con.close();
 sc.close();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}
