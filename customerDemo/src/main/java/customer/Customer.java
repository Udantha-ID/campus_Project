package customer;

public class Customer {
	
	//create attribute database values
	private int id;
	private String name;
	private String email;
	private String phone;
	private String userName;
	private String password;
	
	//Create overloaded constructor 
	public Customer(int id, String name, String email, String phone, String userName, String password) {
		//super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}
//Create get methods 
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
}
