//Niall Stack
/*BicycleFrame.java*/

import javax.swing.*;
import java.awt.event.*;
import java.lang.*;

public class BicycleFrame extends JFrame{
	public static void main(String[] args){
		BicycleFrame win = new BicycleFrame();
		win.setVisible(true);
	}
	public BicycleFrame(){
		super("Bicycle Shop");
		setSize(400,200);
		setLocation(100,200);
		addWindowListener(new WindowEventHandler());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(
			getClass().getResource("untitled.png")).getImage());  
	}
	private class WindowEventHandler extends WindowAdapter{
		ImageIcon img = new ImageIcon("untitled.png");
	}
}