//Niall Stack T00174406 OOP2-Project-2014
/*Feedback.java
 *This programme is a simple JFrame that allows the user to enter their feed back into a JTextField*/
 /*References 
1- From Programmes written by John Walsh
2- http://stackoverflow.com/questions/14735085/clicking-a-jlabel-to-open-a-new-frame
3- http://stackoverflow.com/questions/24076612/opening-editing-and-saving-text-in-jtextarea-to-txt-file
*/
 
 import javax.swing.*;
 import java.util.List;
 import java.util.ArrayList;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 
 public class Feedback extends JFrame implements ActionListener{
 	 JButton submit;
 	 JTextArea textArea;
 	 	public static void main(String[] args){	 	
 			 Feedback frame = new Feedback();
     		frame.setVisible(true);
 	 	}
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
		
  	}
  public void actionPerformed(ActionEvent e){
  		String cmd = e.getActionCommand();
  		
  		if(cmd.equals("Submit"))
        {
            submit();
            dispose();
            JOptionPane.showMessageDialog(null,"Thank you for the Feedback!");
        }
  	}
  	 public void submit(){
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
  }
}