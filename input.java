import java.sql.*;
import java.io.*;

public class input {
      public static void main(String args[]){
            try{
    Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/myjdbc";
    String username="root";
    String password="anushkaa02A$";
    java.sql.Connection con = DriverManager.getConnection(url, username, password);
 
    //create a query
    String q="insert into table1(tName,tCity) values(?,?)";
    
    // get the PreparedStatement object
    PreparedStatement p= con.prepareStatement(q);
    
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name:");
    String name=b.readLine();
    
    System.out.println("Enter city:");
    String city=b.readLine();
    // set the values to query
        
    p.setString(1,name);
    p.setString(2,city);
    
    p.executeUpdate();
    
    System.out.println("Inserted");
    con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

}
