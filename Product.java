//Niall Stack T00174406 OOP2-Project-2014
/*Product.java
 *This program creates the Product class using mutators and constructors.
 *This Product class will then be used for a driver class*/
 
 import java.io.*;
 /*Beginning of the Product Method which creates, alters and allows access to
  *the attributes in it
  */
 public class Product implements Serializable{ //Start of Product
 	private String name;
 	private String description;
 	private String location;
 	
 	public Product() { //Start of Product()
				this("Unknown","Unknown","Unknown");
	}//End of Product()
 	
 	public Product(String name, String description, String location) { //Start of Constructors
				setName(name);
				setDescription(description);
				setLocation(location);
	}//End of Constructors
	
 	
 	//accessor methods to return a copy of the attributes
 	public String getName() { return name; }
 	public String getDescription() { return description; }
 	public String getLocation() { return location; }
 	
 	
 	//mutator methods to alter the value of the attributes
 	public void setName (String name) {
 		this.name = name;
 	}
 	public void setDescription (String description) {
 		this.description = description;
 	}
 	public void setLocation (String location) {
 		this.location = location;
 	}//End of Mutators
 	
 	//toString method to convert attributes into a String
 	public String toString() {
 		return String.format("Name: %s\nDescription: %s\nLocation: %s",getName(),getDescription(),getLocation());
 	}//End of toString Method
 	
 }//End of Product
 