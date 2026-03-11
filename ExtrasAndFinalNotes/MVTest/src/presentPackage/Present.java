package presentPackage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Present extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;	//Used to ensure that the class doesn't have any issues
	
	//Parameters
	private JTextField inputField;	//Stores input field (user typing)
	private JButton enterButton;	//Stores the button to click on after typing
	private JLabel message;
	private JLabel loginMessage;	//This displays when the userID is invalid for the login
	private JFrame frame;
	
	HashMap <String, String> userInfo = new HashMap<String, String>();
	
	//UserID names (lorenzo, leonardo, filippo, pat, & rose)
	UserID userName = new UserID();
	
	
	//Constructor also accepts HashMap
	public Present(HashMap<String, String> userInfoOriginal) {
		
		userInfo = userInfoOriginal;
				
		//Frame
		frame = new JFrame("Present_Test");
		frame.setLayout(new FlowLayout());	//Layout of every object in the frame
		frame.setSize(700, 200);
		//frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		// Button
		enterButton = new JButton("Enter");
		enterButton.setSize(200, 50);
		enterButton.addActionListener(this);
		enterButton.setFocusable(false);
		
		//Label
		message = new JLabel("Enter Your First Name:");
		message.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.add(message);
		
		//TextField (aka the user ID field where the user enters the text)
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension(600, 50));
		inputField.setFont(new Font("Times New Roman", Font.PLAIN, 25));		
		// Add the text to the frame
		frame.add(inputField);
		
		//Add button to the frame
		frame.add(enterButton);
		enterButton.setVisible(true); 
		
		// loginMessage
		loginMessage = new JLabel("");
		loginMessage.setBounds(0, 50, 40, 20);
		loginMessage.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.add(loginMessage);
		
		frame.pack(); // Fits the window size for the textField
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enterButton) {
			
			//Check if name is valid (takes the inputField from the user)
			String userID = inputField.getText();
			
			if(userInfo.containsKey(userID)) {
				TicTacToe game = new TicTacToe();
				
				/*
				Photos photo = new Photos();
				photo.leonardoPhoto();*/
				frame.dispose();
				
				game.getClass();
				//photo.getClass();
			}else {
				loginMessage.setText("The ID " + userID + " is invalid!");
				frame.pack();
			}
			
		}
	}
	
	
	
}
