package in.co.ray.AdvanceJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleCallable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		CallableStatement cs = conn.prepareCall("{Call Demo(?,?)}");
		
		cs.setInt(1, 4);
		cs.registerOutParameter(2,Types.VARCHAR);
//		ResultSet rs = cs.getResultSet();
		
		System.out.println("Hii");
		cs.execute();
		
		String name = cs.getString(2);
		
		System.out.println(name);
        
//		System.out.println(cs.getInt(2));
	}

}
