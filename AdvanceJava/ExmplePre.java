package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExmplePre {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		PreparedStatement stmt = con.prepareStatement("insert into marksheet values(12,112,'Ashutosh','Mishra',65,78,75)");
		int i = stmt.executeUpdate();
		System.out.println(i +" "+"Data Inserted");
		
		con.close();
		stmt.close();

	}

}
