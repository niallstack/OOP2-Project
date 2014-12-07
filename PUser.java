//Niall Stack T00174406 OOP2-Project-2014
/*PUser.java
 *This programme creates the PUser class using mutators and constructors.
 *This PUser class will then be used for a driver class*/
 
 import java.io.*;
 public class PUser implements Serializable{
 	private String userName;
 	private String password;
 	
 	public PUser() {
				this("Unknown","Unknown");
	}
 	
 	public PUser(String userName, String password) {
				setUserName(userName);
				setPassword(password);
	}
	
 	
 	//accessor methods to return a copy of the attributes
 	public String getUserName() { return userName; }
 	public String getPassword() { return password; }
 	
 
 	
 	//mutator methods to alter the value of the attributes
 	public void setUserName (String userName) {
 		this.userName = userName;
 	}
 	public void setPassword (String password) {
 		this.password = password;
 	}
 	
 	//Constructors
 	
 	
 	public String toString() {
 		return String.format("UserName: %s\nPassword: %s",getUserName(),getPassword());
 	}
 	
 	
 }
 