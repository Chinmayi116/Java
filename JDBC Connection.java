import java.sql.*;

class JdbcDemo {
    public static void main(String args[]) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "");

            System.out.println("Connected Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
