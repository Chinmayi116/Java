import java.sql.*;

public class DisplayStudent {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "
                        +rs.getString(2)+" "
                        +rs.getInt(3));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
