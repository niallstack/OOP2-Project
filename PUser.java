//Niall Stack T00174406 OOP2-Project-2014
/*PUser.java
 *This program creates the PUser class using mutators and constructors.
 *This PUser class will then be used for a driver class*/
 
 
 import java.io.*;
 /*Beginning of the PUser Method which creates, alters and allows access to
  *the attributes in it
  */
 public class PUser implements Serializable{ //Start of PUser
 	private String userName;
 	private String password;
 	//Constructors of the attributes
 	public PUser() { //Start of PUser()
				this("Unknown","Unknown");
	}//End of PUser
 	
 	public PUser(String userName, String password) { //Start of Constructors
				setUserName(userName);
				setPassword(password);
	}//End of Constructors
	
 	
 	//accessor methods to return a copy of the attributes
 	public String getUserName() { return userName; }
 	public String getPassword() { return password; }
 	
 	
 	//mutator methods to alter the value of the attributes
 	public void setUserName (String userName) {
 		this.userName = userName;
 	}//End of userName Mutator
 	public void setPassword (String password) {
 		this.password = password;
 	}//End of password Mutator
 	
 	//toString method to convert attributes into a String
 	public String toString() {
 		return String.format("UserName: %s\nPassword: %s",getUserName(),getPassword());
 	}//End of toString method 
 	
 	
 }//End of PUser
 