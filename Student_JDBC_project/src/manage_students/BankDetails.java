package manage_students;
import java.sql.*;
public class BankDetails{

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/bank_management?autoReconnect=true&useSSL=false","root", "Bansal@123");
            String sql = "select * from bank_details";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
        
            while (result.next()) {
                // Print name an age
                System.out.print( "ID: " + result.getString("bank_codes"));
                System.out.print(" Name:" + result.getString("bank_name"));
                System.out.print(" Pin:" + result.getString("bank_pincode"));
                System.out.print(" IFSC:" + result.getString("bank_ifsc"));  
                System.out.println("");
            }
    }
}
