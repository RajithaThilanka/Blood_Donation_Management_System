
package blood_donation_management_system;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

//Connect Database
public class Database_connction{

   public static Connection Connect(){
       
       Connection conn=null;
       PreparedStatement pst=null;
       
       try {
       Class.forName("com.mysql.jdbc.Driver");
         conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3308/blood_donation_db?","root","40553817");  
           
          JOptionPane.showMessageDialog (null,"Connection OK");
       } catch (Exception e) {
           JOptionPane.showMessageDialog (null,"Connection ERRROR");
       }
       
       
    return conn;
   }  
}

