//Niall Stack T00174406 OOP2-Project-2014
/*Feedback.java
 *This program is a simple JFrame that allows the user to enter their feed back into a JTextField*/
 /*References 
1- From Programs written by John Walsh
2- http://stackoverflow.com/questions/14735085/clicking-a-jlabel-to-open-a-new-frame - By Robin Chander
3- http://stackoverflow.com/questions/24076612/opening-editing-and-saving-text-in-jtextarea-to-txt-file - By Arijit
*/
 
 import javax.swing.*;
 import java.util.List;
 import java.util.ArrayList;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 //Start of Feedback method which is executed through the GUI
 public class Feedback extends JFrame implements ActionListener{ //Start of Feedback
 	 JButton submit;
 	 JTextArea textArea;
 	 //The main method of the Feedback Class
 	 	public static void main(String[] args){	 	
 			 Feedback frame = new Feedback();
     		frame.setVisible(true);
 	 	}//End of main
 	 	//The JFrame is constructed here
 public Feedback(){
 		super("Feedback");
 	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
		setTitle("Stuff-Stack - Feedback");
		Container cPane;
		cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());
		setSize(300,300);
		setLocationRelativeTo(null);
		textArea = new JTextArea(10,25);
		cPane.add(textArea);
		submit = new JButton("Submit");
		submit.addActionListener(this);
        submit.setActionCommand("Submit");
		cPane.add(submit);
		
  	}//End of Feedback()
  	//Anonymous Class to listen for events in the program
  public void actionPerformed(ActionEvent e){ //Start of Anonymous Class
  		String cmd = e.getActionCommand();
  		
  		if(cmd.equals("Submit"))
        {
            Submit();
            dispose();
            JOptionPane.showMessageDialog(null,"Thank you for the Feedback!");
        }
  	}//End of Anonymous Class
  	
  	//Here the text entered into the JTextArea is saved 
/*3*/ public void Submit(){ //Start of submit()
        File file = null;
        FileWriter out=null;

	
        try {
            file = new File("Feedback.txt");
            out = new FileWriter(file);     
            out.write(textArea.getText());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
  }//End of submit()
}//End of Feedback