import java.sql.*;

public class InsertStudent {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student(name, age) VALUES(?, ?)");

            ps.setString(1, "Rahul");
            ps.setInt(2, 20);

            ps.executeUpdate();

            System.out.println("Record Inserted Successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
