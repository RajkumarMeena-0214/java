package in.co.ray.AdvanceJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Example3 {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	CallableStatement cal = conn.prepareCall("{CALL getName(?,?)}");
	
	cal.setInt(1,2);
	cal.registerOutParameter(2,Types.VARCHAR);
	cal.execute();
	System.out.println(cal.getString(2));
	
}
}
