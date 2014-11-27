//Niall Stack T00174406 OOP2-Project-2014
/*Product.java
 *This programme creates the Product class using mutators and constructors.
 *This Product class will then be used for a driver class*/
 
 import java.io.*;
 public class Product implements Serializable{
 	private String name;
 	private String description;
 	private String location;
 	
 	public Product() {
				this("Unknown","Unknown","Unknown");
	}
 	
 	public Product(String name, String description, String location) {
				setName(name);
				setDescription(description);
				setLocation(location);
	}
	
 	
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
 	}
 	
 	//Constructors
 	
 	
 	public String toString() {
 		return String.format("Name: %s\nDescription: %s\nLocation: %s",getName(),getDescription(),getLocation());
 	}
 	
 	
 }
 