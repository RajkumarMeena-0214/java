package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ResourceBundleEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Bundle.System");
    Class.forName(rs.getString("Driver"));
    String url =rs.getString("url");
    String user= rs.getString("user");
    String password= rs.getString("password");
    
    Connection conn= DriverManager.getConnection(url,user,password);
    Statement st = conn.createStatement();
    
    int i = st.executeUpdate("Insert into marksheet values(16,116,'Arun','Saini',97,98,99,294,98,'pass')");
    System.out.println(i +" "+ "Done");
	
conn.close();
}
}