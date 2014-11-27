//Niall Stack T00174406 OOP2-Project-2014
/*GUI.java
 *This programme is the GUI that uses the information created in the drivers classes*/
 
 import javax.swing.*;
 import java.util.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class GUI extends JFrame implements ActionListener{
 	JMenuBar menuBar = new JMenuBar();
	public GUI(){
		setTitle("Stuff-Stack");
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int xSize = ((int) tk.getScreenSize().getWidth());  
		int ySize = ((int) tk.getScreenSize().getHeight());  
		setSize(xSize,ySize);

	//	setSize(600,600);
	//	setLocationRelativeTo(null);
	//	setLocation(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createUserMenu();
		createProductMenu();
		setJMenuBar(menuBar);
		addWindowListener(new WindowEventHandler());
		setIconImage(new ImageIcon(
		getClass().getResource("Shopping-Basket-icon.png")).getImage());
	}
	public static void main(String[] args){
		
		GUI menu = new GUI();
		menu.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		
			
			
			
	}
	
	private class WindowEventHandler extends WindowAdapter{
		ImageIcon img = new ImageIcon("Shopping-Basket-icon.png");
			public void windowClosing(WindowEvent e){
		int option = JOptionPane.showConfirmDialog(null,"Are you sure you wish to exit?");
		
			if(option == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
		
		}
	}
	public void createUserMenu(){
		JMenu UserMenu = new JMenu("User");
		menuBar.add(UserMenu);
		JMenuItem add = new JMenuItem("Add");
		UserMenu.add(add);
		add.addActionListener(this);
	}
	public void createProductMenu(){
		JMenu product = new JMenu("Product");
		menuBar.add(product);
		JMenuItem add = new JMenuItem("Add");
		product.add(add);
		add.addActionListener(this);
		
	}
 }