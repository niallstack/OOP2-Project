//Niall Stack T00174406 OOP2-Project-2014
/*User.java
 *This programme creates the User class using mutators and constructors.
 *This User class will then be used for a driver class*/
 
 import java.io.*;
 public class User implements Serializable{
 	private String name;
 	private String userName;
 	private String password;
 	private String email;
 	
 	//accessor methods to return a copy of the attributes
 	public String getName() { return name; }
 	public String getUserName() { return userName; }
 	public String getPassword() { return password; }
 	public String getEmail() { return email; }
 	
 	
 	//mutator methods to alter the value of the attributes
 	public void setName (String name) {
 		this.name = name;
 	}
 	public void setUserName (String userName) {
 		this.userName = userName;
 	}
 	public void setPassword (String password) {
 		this.password = password;
 	}
 	public void setEmail (String email) {
 		this.email = email;
 	}
 	
 	public String toString() {
 		return getName() + " " + getUserName() + " " + getPassword() + " " + getEmail();
 	}
 	
 	
 }
 