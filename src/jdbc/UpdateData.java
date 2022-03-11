package jdbc;

import java.sql.*;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "user";
        String password = "password";

        String QUERY = "update student set studentname=? where rollno=?;";

        Connection con = null;
        PreparedStatement ps = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            ps = con.prepareStatement(QUERY);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Updated Student Name: ");
            ps.setString(1,sc.next());

            System.out.println("Enter Student Roll No : ");
            ps.setInt(2,sc.nextInt());

            int row = ps.executeUpdate();
            System.out.println(row+" row are affected");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            ps.close();
            con.close();
        }

    }
}
