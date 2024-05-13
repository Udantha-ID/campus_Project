package customer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDbUtil {
	
	//public static String Connection con = null;
	

	//Validate user name and password 
	public static List<Customer> validate(String userName, String password){
		
		//Create ArrayList Customer and create object
		ArrayList<Customer> cus = new ArrayList<>();
		
		//Create database Connection
				String url = "jdbc:mysql://localhost:3306/customerdetilas";
				String user = "root";
				String pass = "45615";
		
		//Validate 
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM cus_Details WHERE userName='"+userName+"' and password = '"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
				//Boolean values Check the Database values true or false
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);	
				String phone =rs.getString(4);
				String userName1 = rs.getString(5);
				String password1 = rs.getString(6);
					
				//Create Customer class object and pass the values in Constructor
				Customer obCus = new Customer(id, name, email, phone, userName1, password1);
					
				//Pass the Array object to customer Object
				cus.add(obCus);
				
				}
			 
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return cus;
	}
	
	
	
	
	
//Registered.jsp values get And insert to data base
	
		public static boolean insertCustomer(String name, String email, String phone, String userName, String password){
			boolean isTrue = false;
			
			//Create database Connection
			String url = "jdbc:mysql://localhost:3306/customerdetilas";
			String user = "root";
			String pass = "45615";
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				
				//Insert Into Values Customer DataBase
				String sql = "INSERT INTO cus_Details VALUES(0,'"+name+"', '"+email+"', '"+phone+"', '"+userName+"', '"+password+"')";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isTrue = true;
				}
				else {
					isTrue = false;
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			//Return values
			return isTrue;
		}
	
	
}
 