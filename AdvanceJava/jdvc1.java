package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdvc1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
//			create connection
//			load my sqldatabase driver
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn=  DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
			
			//Create statement and quary
			
			Statement stmt= conn.createStatement();
			int i = stmt.executeUpdate("Update marksheet SET id=1 where id=22");
			System.out.println(i+" "+"Record is updated");
			
			//Close conection
			
			stmt.close();
			conn.close();
		}

	}

