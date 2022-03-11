package jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class InsertData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "user";
        String password = "password";

        String QUERY = "INSERT INTO student(RollNo,StudentName,class,division) values (?,?,?,?);";

        Connection con = null;
        PreparedStatement ps = null;


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            ps = con.prepareStatement(QUERY);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Roll No: ");
            ps.setInt(1,sc.nextInt());

            System.out.println("Enter Student Name: ");
            ps.setString(2,sc.next());

            System.out.println("Enter Class : ");
            ps.setInt(3,sc.nextInt());

            System.out.println("Enter Division : ");
            ps.setString(4,sc.next());

//            System.out.println("Enter Birth Date (yyyy-mm-dd) : ");
//            String date = sc.next();
//            Date date1 = new SimpleDateFormat("yyyy-mm-dd");
//            ps.setDate(5,sc.nextDouble());

            int rows = ps.executeUpdate();
            System.out.println(rows +" rows are affected.");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            ps.close();
            con.close();
        }
    }
}
