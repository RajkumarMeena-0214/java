package in.co.ray.AdvanceJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallUserCount {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		CallableStatement cs = con.prepareCall("{call getRajkumar(?)}");
		
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		
		System.out.println(cs.getInt(1));
		
		con.close();
		cs.close();

	}

} 
