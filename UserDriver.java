//Niall Stack T00174406 OOP2-Project-2014
/*UserDriver.java
 *This driver uses the accessor and mutator methods created in User.java and gives them values */
 
 import java.util.*;
 import java.io.*;
 import javax.swing.*;
 
 public class UserDriver{
 	public static void main(String[] args) throws /*IO*/ Exception/* FileNotFoundException*/
 	{
 		
 		List<User> allMembers = new ArrayList<User>();
 		User member;
 		String confirm ="OK";
 	//	User member = new User();
 	
 	
 		while (confirm.equals("OK"))
 		{
 		
 		String name;
 		name = JOptionPane.showInputDialog("Please Enter Your Name: ");
 		
 		String userName;
 		userName = JOptionPane.showInputDialog("Please Enter Your UserName: ");
 		
 		String password;
 		password = JOptionPane.showInputDialog("Please Enter Your Password: ");
 		
 		String email;
 		email = JOptionPane.showInputDialog("Please Enter Your Email: ");
 		
 		break;
 		
 		}
 		File f1 = new File("AllMembers.dat");
		
		FileOutputStream fos = new FileOutputStream(f1);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(allMembers);
		oos.close();
 	}
 }