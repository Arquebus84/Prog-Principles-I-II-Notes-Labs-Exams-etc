package presentPackage;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Photos{

	JFrame frame = new JFrame("Photo");
	
	ImageIcon image;
	JLabel displayField;
	
	public Photos() {
		
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		//frame.pack();	//Fits the window to the size of the picture
		frame.setVisible(true);
				
		/*try {
			image = new ImageIcon(getClass().getResource("Picture01.png"));
			displayField = new JLabel(image);
			frame.add(displayField);
			
		}catch(Exception e) {
			System.out.println("Image not found");
		}*/
	}
	
	//In each namePhoto, the method will be invoked depending on the userID typed
	public void lorenzoPhoto() {
		image = new ImageIcon(getClass().getResource("Picture01.png"));
		displayField = new JLabel(image);
		frame.add(displayField);
	}
	
	public void patPhoto() {
		image = new ImageIcon(getClass().getResource("Picture01.png"));
		displayField = new JLabel(image);
		frame.add(displayField);
	}
	
	public void filippoPhoto() {
		image = new ImageIcon(getClass().getResource("Picture01.png"));
		displayField = new JLabel(image);
		frame.add(displayField);
	}
	
	public void leonardoPhoto() {
		image = new ImageIcon(getClass().getResource("Picture01.png"));
		displayField = new JLabel(image);
		frame.add(displayField);
	}
	
	public void rosePhoto() {
		image = new ImageIcon(getClass().getResource("Picture01.png"));
		displayField = new JLabel(image);
		frame.add(displayField);
	}
}
