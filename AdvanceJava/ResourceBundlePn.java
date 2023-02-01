package in.co.ray.AdvanceJava;

import java.util.Locale;
import java.util.ResourceBundle;



public class ResourceBundlePn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Locale loc = new Locale("In","Pn");
     
     ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Bundle.self_pn",loc); 
     System.out.println(rs.getString("Execute"));
	}

}
