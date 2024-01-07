package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            //    -------------JDBC CODE FOR CONNECT DATABASE-------------
            Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/globaltransit_db", "root", "Nitin123@000#");
        st=c.createStatement();
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
    }
    
    
    
}
