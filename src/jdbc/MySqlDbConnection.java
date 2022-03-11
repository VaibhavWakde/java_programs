package jdbc;


/**
 * connect mysql and fetch data from table and show data....
 */

import com.mysql.cj.protocol.Resultset;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class MySqlDbConnection {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "user";
        String password = "password";

        Connection con = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while (rs.next()){
                Integer id = rs.getInt(1);
                Integer rollno = rs.getInt(2);
                String name = rs.getString(3);
                System.out.println("ID: "+id+" Roll No: "+rollno+" Student name : "+name);


            }
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }finally {
            st.close();
            con.close();
        }
    }
}
