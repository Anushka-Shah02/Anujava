
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Update {
     public static void main(String args[]){
         try{
           Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/myjdbc";
    String username="root";
    String password="anushkaa02A$";
    java.sql.Connection con = DriverManager.getConnection(url, username, password);
 
       String q="update table1 set tName =?, tCity=? where tId=? "; 
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter new Name:");
          String name=br.readLine();
          
          System.out.println("Enter new City:");
          String city=br.readLine();
          
          System.out.println("Enter the Student id:");
         
          int id=Integer.parseInt(br.readLine());
          
           PreparedStatement p=con.prepareStatement(q);
           p.setString(1,name);
           p.setString(2,city);
           p.setInt(3,id);
           
           p.executeUpdate();
           System.out.println("Done");
           
           con.close();
           
          
         }catch(Exception e){
             e.printStackTrace();
         }
     }    
}
