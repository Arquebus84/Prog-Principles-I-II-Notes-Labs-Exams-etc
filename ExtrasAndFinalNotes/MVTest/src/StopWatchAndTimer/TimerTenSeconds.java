package StopWatchAndTimer;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TimerTenSeconds implements ActionListener{
	
	private final int HEIGHT = 400;
	private final int WIDTH = 600;

	JFrame frame = new JFrame();

	JButton startButton = new JButton("Start");
	JButton pauseButton = new JButton("Pause");
	JButton restartButton = new JButton("Restart");

	JLabel timeLabel = new JLabel();
	int elapsedTime = 0;
	int seconds = 10;
	int minutes = 0;
	int hours = 0;

	String seconds_String = String.format("%02d", seconds);
	String minutes_String = String.format("%02d", minutes);
	String hours_String = String.format("%02d", hours);

	// Add the Timer class
	Timer timer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// NOTE: If you wrote elapsedTime/1000, it gives the total elapsed seconds, not
			// the current second itself (use % 60 after this)			
			elapsedTime += (seconds > 0)? -1000 : 0;						
			seconds = (elapsedTime / 3600000); // 3,600,000 milliseconds in an hour
			minutes = (elapsedTime / 60000) % 60; // 60,000 milliseconds in a minute; get the remainder in order to obtain the current minute
			
			//seconds = (elapsedTime / 1000) % 60;	//converts 1000 milliseconds per 1 second
			seconds = 10 + (elapsedTime / 1000) % 60;
			seconds_String = String.format("%02d", seconds);
			minutes_String = String.format("%02d", minutes);
			hours_String = String.format("%02d", hours);
			timeLabel.setText(hours_String + ":" + minutes_String + ":" + seconds_String);
		}
	});

	public TimerTenSeconds() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Stopwatch Timer");

		timeLabel.setBounds(200, 50, 200, 100);
		timeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);

		startButton.setBounds(150, 200, 100, 50);
		startButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		// NOTE: You can use Lambda expression to create an anonymous inner class
		// (Similar to JavaFX)
		/**
		 * startButton.addActionListener(e ->{
		 * System.out.println(((JButton)e.getSource()).getText()); });
		 */
		// But, for now, use the overrided actionPerformed(ActionEvent e) method
		startButton.addActionListener(this);
		pauseButton.setBounds(250, 200, 100, 50);
		pauseButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pauseButton.addActionListener(this);
		restartButton.setBounds(350, 200, 100, 50);
		restartButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		restartButton.addActionListener(this);

		// Layout and displaying the window
		frame.add(startButton);
		frame.add(pauseButton);
		frame.add(restartButton);
		frame.add(timeLabel);
		timeLabel.setText(hours_String + ":" + minutes_String + ":" + seconds_String);

		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	// Action Listener
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(((JButton) e.getSource()).getText());

		if (e.getSource() == startButton) {
			start();
		} else if (e.getSource() == pauseButton) {
			pause();
		} else if (e.getSource() == restartButton) {
			restart();
		}
	}

	// If the startButton was pressed
	public void start() {
		timer.start();
	}

	// If the pauseButton was pressed
	public void pause() {
		timer.stop();
	}

	// If the restartButton was pressed
	public void restart() {
		//timer.restart();	//The restart method resets the timer to zero, not 10
		if(seconds >= 0 && seconds < 10) {
			elapsedTime = 0;
			seconds = 10 * (elapsedTime/1000) % 60;
		}
	}
}
