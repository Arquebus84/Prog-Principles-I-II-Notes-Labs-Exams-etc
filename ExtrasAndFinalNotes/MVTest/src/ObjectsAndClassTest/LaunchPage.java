package ObjectsAndClassTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This import is for the visual button and frame
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton("Click Here!");
	
	public LaunchPage(){
		button.setBounds(200, 100, 200, 100);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLayout(null);
		
		//Places the at the center of the screen and uses the button for reference
		frame.setLocationRelativeTo(button);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			frame.dispose();
			NewWindow newWin = new NewWindow();
			
			newWin.getClass();
		}
		
	}
}
