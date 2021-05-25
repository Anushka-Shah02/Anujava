import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select {
        public static void main(String args[]){
         try{
           Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/myjdbc";
    String username="root";
    String password="anushkaa02A$";
    java.sql.Connection con = DriverManager.getConnection(url, username, password);
         
         String query="select * from table1";
         Statement s=con.createStatement();
         ResultSet set =s.executeQuery(query);
         
         while(set.next()){
             int id=set.getInt(1);
             String name=set.getString(2);
             String city=set.getString(3);
             System.out.println(id+ ":" +name+ "->"+city);
         }
         
         con.close();
         
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }    
    }  
}
