package pre_alpha;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import graphics.Render;
import graphics.Screen;

public class Display extends Canvas implements Runnable{
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Pre-Alpha";
	
	private Thread thread;
	private HandleTime handleTime;
	private Screen screen;
	private BufferedImage img;
		
	private Render render;
	private boolean running = false;
	private int[] pixels;
	
	public Display() {
		screen = new Screen(WIDTH, HEIGHT);
		//Calls HandleTime, but animations are updated in the tick() method 
		handleTime = new HandleTime();
		//color
		img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);		
		//assign pixels array to the pixels in Render class
		pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
	}
	
	private void start() {
		if(running) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	private void stop() {
		if(!running) {
			return;
		}
		running = false;
		//Tries to end the thread; if that doesn't work, it will try an exception
		try {
			thread.join();
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void run() {
		//FPS count was inspired not by the tutorial, but a comment from the video: his code is more efficient
		int frames = 0;
		long previousTime = System.nanoTime();
		
		while(running) {
			tick();
			render();
			frames++;
			long currentTime = System.nanoTime();
			if(currentTime - previousTime > 1000000000) {
				System.out.println("FPS: " + frames);
				frames = 0;
				previousTime = currentTime;
			}
		}
	}
	
	private void tick() {
		handleTime.tick();
	}
	
	private void render() {
		//graphics item that is needed
		BufferStrategy bStrategy = this.getBufferStrategy();
		//we only want to start bStrategy once
		if(bStrategy == null) {
			createBufferStrategy(3);
			return;			
		}
		screen.render(handleTime);
		
		//Do this width * height (40,000) times
		for(int i = 0; i < WIDTH * HEIGHT; i++) {
			pixels[i] = screen.pixels[i];
		}		
		Graphics g = bStrategy.getDrawGraphics();
		
		//Change the size of the pixels being rendered
		g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
		g.dispose();
		bStrategy.show();
	}
	
	public static void main(String[] args) {
		Display window = new Display();
		JFrame frame = new JFrame();
		
		frame.add(window);
		frame.setResizable(false);
		frame.pack();
		frame.setTitle(TITLE);;
		frame.setSize(WIDTH, HEIGHT);		
		//Terminates the window after you click to close it
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Centers the window
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);		
		window.start();
	}
}