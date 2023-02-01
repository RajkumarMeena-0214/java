package in.co.ray.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		
		try {
			cn.setAutoCommit(false);
			Statement st = cn.createStatement();
			String s1 = "insert into marksheet values(13,113,'Aniket','Mishra',10,10,10,30,10,'Fail')";
            String s2 = "insert into marksheet values(14,114,'Geet','Tiwari',50,50,50,150,50,'Pass')"; 
            String s3 = "update marksheet set fname= 'Govind' where id =7";
            String s4 = "insert into marksheet values(15,115,'Sharvan','Meena',60,50,50,160,55,'Pass')";
            
            int i = st.executeUpdate(s1);
                i = st.executeUpdate(s2);
                i = st.executeUpdate(s3);
                i = st.executeUpdate(s4);
                
                System.out.println("Succes");
                cn.commit();
		} catch (SQLException e) {
			
			cn.rollback();
			System.out.println("Oops Transaction fail");
		}
		cn.close();
		

	}

}
