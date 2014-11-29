//Niall Stack T00174406 OOP2-Project-2014
/*GUI.java
 *This programme is the GUI that uses the information created in the drivers classes*/
 
 import javax.swing.*;
 import java.util.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class GUI extends JFrame implements ActionListener{
 	JMenu User;
 	
 	public static void main(String[] args){
		
	 GUI frame = new GUI();
        frame.setVisible(true);
	}
	public GUI(){
	/*
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int xSize = ((int) tk.getScreenSize().getWidth());  
		int ySize = ((int) tk.getScreenSize().getHeight());  
		setSize(xSize,ySize);*/
		setTitle("Stuff-Stack");
		Container cPane;
		cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());
		setSize(600,600);
		setLocationRelativeTo(null);

		addWindowListener(new WindowEventHandler());
		setIconImage(new ImageIcon(
		getClass().getResource("Shopping-Basket-icon.png")).getImage());
		createUserMenu();
		JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(User);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
/*	public UserDriver(){
        setSize(200, 200);
        setVisible(true);
        //additional calls
     }*/
	
	public void actionPerformed(ActionEvent e){
		String  menuName;
        menuName = e.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("New User")) {
        		UserDriver f2 = new UserDriver();
				this.setVisible(false); 
				setVisible(true); 
        }		
									
	}
	
	
	private class WindowEventHandler extends WindowAdapter{
		ImageIcon img = new ImageIcon("Shopping-Basket-icon.png");
		/*	public void windowClosing(WindowEvent e){
		int option = JOptionPane.showConfirmDialog(null,"Are you sure you wish to exit?");
		
			if(option == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		}*/
	}
	
	public void createUserMenu(){
		JMenuItem    item;
		User = new JMenu("User");
		item = new JMenuItem("New User");        
        item.addActionListener( this );
        User.add( item );

        
     //   item = new JMenuItem("Open...");    
     //   item.addActionListener( this );
     //   fileMenu.add( item );
	}
/*	public void createProductMenu(){
		JMenu product = new JMenu("Product");
		menuBar.add(product);
		JMenuItem add = new JMenuItem("Add");
		product.add(add);
		add.addActionListener(this);
		
	}*/
 }