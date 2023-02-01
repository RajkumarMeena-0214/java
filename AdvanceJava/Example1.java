package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//(1) Create a connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		//(2) Create Statement Query 
		Statement stmt= con.createStatement();
		int i=stmt.executeUpdate("insert into marksheet VALUES (11,111,'Rahul','Singh',100,90,80)");
		
		//(3) Execute Statement/Quary
		System.out.println(i+" "+"Data Inserted");
		
		//(4) Close Connection
		stmt.close();
		con.close(); 
		

	}

}
