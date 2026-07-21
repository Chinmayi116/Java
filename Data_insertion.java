import java.sql.*;

class InsertStudent{
public static void main(String args[]) throws Exception{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/studentdb",
"root",
"");

PreparedStatement ps=con.prepareStatement(
"insert into student values(?,?)");

ps.setInt(1,101);
ps.setString(2,"Rahul");

ps.executeUpdate();

System.out.println("Record Inserted");

con.close();

}
}
