//Niall Stack T00174406 OOP2-Project-2014
/*GUI.java
 *This programme is the GUI that uses the mutators and accessors from the user and 
 *product classes*/
 
 import javax.swing.*;
 import java.util.List;
 import java.util.ArrayList;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 
 public class GUI extends JFrame implements ActionListener{
 	JMenu User;
 	JMenu Product;
 	JButton proceed;
    private JLabel imageLabel;
    private JLabel promptLabel;
  //  private JLabel promptLabel2;
 	public static void main(String[] args){
		
	 GUI frame = new GUI();
        frame.setVisible(true);
	}
	public GUI(){
		super("GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
		setTitle("Stuff-Stack");
		Container cPane;
		cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());
		setSize(700,700);
		setLocationRelativeTo(null);
		imageLabel = new JLabel(new ImageIcon("create_thumb.png"));
		cPane.add(imageLabel);
		promptLabel = new JLabel("<html><br><h1>Welcome to Stuff-Stack</h1><br> The online store where you can look at the item in person before you buy!<br>Simply make an account, ask to purchase an item and then it will be sent to one of our locations for you to view<br><br><br><h2>Selling</h2><br>If you wish to sell something,<br> simply enter the details of the product and it will be sent to a moderator, who will add it to the site.</html>");
        cPane.add(promptLabel);
        //promptLabel2 = new JLabel("<html><br><br><h1>Selling</h1><br>If you wish to sell something,<br> simply enter the details of the product and it will be sent to a moderator, who will add it to the site</html>");
        //cPane.add(promptLabel2);
		addWindowListener(new WindowEventHandler());
		setIconImage(new ImageIcon(
		getClass().getResource("Shopping-Basket-icon.png")).getImage());
		proceed = new JButton("Proceed");
		proceed.addActionListener(this);
        proceed.setActionCommand("Proceed");
		cPane.add(proceed);
		createUserMenu();
		createProductMenu();
		JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(User);
        menuBar.add(Product);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public void actionPerformed(ActionEvent e){
		String  menuName;
		String cmd = e.getActionCommand();
        menuName = e.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        try{
        
        if (menuName.equals("New User")) {
        	UserDriver();
        }
        else if (menuName.equals("Add Product")) {
        	ProductDriver();
        }
        else if(menuName.equals("View User"))
        {
        	List<User> readMembers = new ArrayList<User>();
			File readFile = new File("allMembers.dat");
			FileInputStream fis = new FileInputStream(readFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			readMembers = (ArrayList<User>) ois.readObject();
		
			for(int i = 0;i < readMembers.size();i++)
			{
				
			JOptionPane.showMessageDialog(null,readMembers.get(i).toString());
			}
        }
        if(cmd.equals("Proceed"))
        {
            dispose();
            new Market();
        }
        					
        }
        catch(Exception c){
        
        }
        				
	}
	
	private class WindowEventHandler extends WindowAdapter{
		ImageIcon img = new ImageIcon("Shopping-Basket-icon.png");
			public void windowClosing(WindowEvent e){
		int option = JOptionPane.showConfirmDialog(null,"Are you sure you wish to exit?");
		
			if(option == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		}
	}
	
	public void createUserMenu(){
		JMenuItem    item;
		User = new JMenu("User");
		item = new JMenuItem("New User");        
        item.addActionListener( this );
        User.add( item );
        item = new JMenuItem("View User");
        item.addActionListener( this );
        User.add( item );
    
	}
	public void createProductMenu(){
		JMenuItem    item;
		Product = new JMenu("Product");
		item = new JMenuItem("Add Product");        
        item.addActionListener( this );
        Product.add( item );
		

	}
	
	public User UserDriver() throws /*IO*/ Exception/* FileNotFoundException*/
	{
		List<User> allMembers = new ArrayList<User>();
 		User member = new User();
 		int confirm = JOptionPane.YES_OPTION;
 	
 	
 		while(confirm == JOptionPane.YES_OPTION)
 		{
 		
 			String name;
 			name = JOptionPane.showInputDialog("Please Enter Your Name: ");
 			
 			String userName;
 			userName = JOptionPane.showInputDialog("Please Enter Your UserName: ");
 			
 			String password;
 			password = JOptionPane.showInputDialog("Please Enter Your Password: ");
 			
 			String email;
 			email = JOptionPane.showInputDialog("Please Enter Your Email: ");
 		
 			member = new User(name,userName,password,email);
 			
 		
 			confirm = JOptionPane.showConfirmDialog(null,"Do you want to change");
 			if(confirm == JOptionPane.CANCEL_OPTION)
 			{
 				System.exit(0);
 			}
 			allMembers.add(member);
 		
 		}
 		
 		
 		File f1 = new File("AllMembers.dat");
		
		FileOutputStream fos = new FileOutputStream(f1);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(allMembers);
		oos.close();
		
		
		 JOptionPane.showMessageDialog(null," " + member.toString());
		 
		 return member;
		
				
	}

	public Product ProductDriver() throws /*IO*/ Exception/* FileNotFoundException*/
	{
		List<Product> allProducts = new ArrayList<Product>();
 		Product products = new Product();
 		int confirm = JOptionPane.YES_OPTION;
 	
 	
 		while(confirm == JOptionPane.YES_OPTION)
 		{
 		
 			String name;
 			name = JOptionPane.showInputDialog("Please Enter The Product Name: ");
 			
 			String description;
 			description = JOptionPane.showInputDialog("Please Enter A Brief Product Description: ");
 		
 			String location;
 			location = JOptionPane.showInputDialog("Please Enter Your Location: ");
 			
 			JOptionPane.showMessageDialog(null,"Thank you, the Moderator will view your request and further details will be sent via email");
 		
 			products = new Product(name,description,location);
 			
 			confirm = JOptionPane.showConfirmDialog(null,"Do you want to change");
 			if(confirm == JOptionPane.CANCEL_OPTION)
 			{
 				System.exit(0);
 			}
 			allProducts.add(products);
 		
 		}
 		
 		File f1 = new File("AllProducts.dat");
		
		FileOutputStream fos = new FileOutputStream(f1);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(allProducts);
		oos.close();
		
		JOptionPane.showMessageDialog(null," " + products.toString());
		
		return products;
 	}
 
	
 }
 