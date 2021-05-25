import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Create{
    public static void main(String args[]){
        try{
        //load the driver
     Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url= "jdbc:mysql://localhost:3306/myjdbc";
    String username="root";
    String password="anushkaa02A$";
    Connection con = DriverManager.getConnection(url, username, password);
        // create a query 
        
        String q ="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
        // create a statement
        Statement s=con.createStatement();
        
        s.executeUpdate(q);
        System.out.println("Table created");
        
        con.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}