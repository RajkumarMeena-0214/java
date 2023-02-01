package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleHi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Locale l=new Locale("Hi","In","Mp");
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Bundle.app",l);
		System.out.println(rs.getString("gretting"));
		
	}

}
