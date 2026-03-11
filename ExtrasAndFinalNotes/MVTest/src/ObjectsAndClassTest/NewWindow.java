package ObjectsAndClassTest;

import java.io.File;

import java.awt.Font;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Happy Holidays!");
	
	File fileImage = new File("C:\\Users\\matte\\OneDrive\\Pictures\\Picture01.png");
	ImageIcon image;
	
	public static int WIDTH = 600;
	public static int HEIGHT = 400;
	
	public NewWindow(){
								
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLayout(null);
						
		try {
			image = new ImageIcon(fileImage.toURI().toURL());
			
		}catch(Exception ex) {
			System.out.println("Image not Found");
		}	
		
		JLabel imageLabel = new JLabel(image);
		imageLabel.setBounds(frame.getWidth() / 2, 0, image.getIconWidth(), image.getIconHeight());
		
		label.setBounds(frame.getWidth(), frame.getHeight(), 500, 100);
		label.setFont(new Font(null, Font.PLAIN, 50));
		
		frame.add(label);
		frame.add(imageLabel);
		
		//Places the at the center of the screen and uses the button for reference
		frame.setLocationRelativeTo(label);
		frame.setVisible(true);
	}
}
