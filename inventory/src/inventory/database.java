package inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Fachrizal
 */
public class database {
  Connection koneksi=null;
     public static Connection koneksiDB(){
 try { 
     Class.forName("com.mysql.cj.jdbc.Driver");
    Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
       return koneksi;
 }catch(Exception e) {
 JOptionPane.showMessageDialog(null, e);
     return null;
    }
 }       
}
