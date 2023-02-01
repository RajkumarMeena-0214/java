package in.co.ray.AdvanceJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class PageNo_23 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		CallableStatement stmt = conn.prepareCall("{call demo(?,?)}");
		                                                     //1,2
		stmt.setInt(1,102);
		
		stmt.registerOutParameter(2,Types.VARCHAR);
		stmt.execute();
		String name=stmt.getString(2);
		System.out.println(name);

	}

}
