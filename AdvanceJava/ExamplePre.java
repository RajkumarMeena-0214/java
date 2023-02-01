package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExamplePre {
	
	public static void main (String [] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		PreparedStatement stmt= con.prepareStatement("Select *from marksheet");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next())
		{
//			System.out.print(rs.getInt(1)+"\t");
//			System.out.print(rs.getInt(2)+"\t"); 
//			System.out.print(rs.getString(3)+"\t");
//			System.out.print(rs.getString(4)+"\t");
//			System.out.print(rs.getInt(5)+"\t");
//			System.out.print(rs.getInt(6)+"\t");
//			System.out.println(rs.getInt(7));
			
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getInt("Rollno") + "\t");
			System.out.print(rs.getString("fname") + "\t");
			System.out.print(rs.getString("lname") + "\t");
			System.out.print(rs.getInt("Physics") + "\t");
			System.out.print(rs.getInt("Chemistry") + "\t");
			System.out.print(rs.getInt("Maths") + "\t");
			System.out.print(rs.getInt("Total") + "\t");
			System.out.print(rs.getInt("Percentage") + "\t");
			System.out.println(rs.getString("Result") + "\t");
		}
			stmt.close();
		con.close();
	}

}
