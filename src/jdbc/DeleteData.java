package jdbc;

import java.sql.*;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "user";
        String password = "password";

        Connection con = null;
        PreparedStatement ps = null;

        String QUERY = "delete from student where studentname= ?;";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            ps = con.prepareStatement(QUERY);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Student Name : ");
            ps.setString(1,sc.next());

            int row = ps.executeUpdate();
            System.out.println(row+" rows are affected");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            ps.close();
            con.close();
        }
    }
}
