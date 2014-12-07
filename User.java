  import java.io.*;
 
 /**
  *<h1>User</h1>
  *This program creates the User class using mutators and constructors.
  *This User class will then be used for a driver method within the GUI class.
  *<p>
  *<b>Note:</b> This Code is commented using Javadoc where as the other
  *classes in my program are not.
  *
  *@author Niall Stack T00174406
  *@version 2.0
  *@Since 2014-11-27   
  */
 public class User implements Serializable{
 	/**
 	 *This method is used to construct and mutate attributes that
 	 *will eventually be used as part of the larger program 
 	 *that begins from the GUI class
 	 *@param name The first parameter of User
 	 *@param userName another parameter of User
 	 *@param password another parameter of User
 	 *@param email another parameter of User
 	 */
 	private String name;
 	private String userName;
 	private String password;
 	private String email;
 	
 	public User() {
				this("Unknown","Unknown","Unknown","Unknown");
	}
 	
 	public User(String name, String userName, String password, String email) {
				setName(name);
				setUserName(userName);
				setPassword(password);
				setEmail(email);
	}
	
 	/**
 	 *These are the Accessor methods which return a copy of the attributes
 	 */
 	public String getName() { return name; }
 	public String getUserName() { return userName; }
 	public String getPassword() { return password; }
 	public String getEmail() { return email; }
 	
 
 	/**
 	 *These are the Mutator methods which alter the value of the attributes
 	 */
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
 	
 	/**
 	 *This is the toString method which returns the attributes as a string
 	 */
 	public String toString() {
 		return String.format("Name: %s\nUserName: %s\nPassword: %s\nEmail: %s",getName(),getUserName(),getPassword(),getEmail());
 	}	
 }
 