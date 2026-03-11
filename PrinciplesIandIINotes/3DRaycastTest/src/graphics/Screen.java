package graphics;
import java.util.Random;
import pre_alpha.HandleTime;

public class Screen extends Render{
	
	private Render test;
	private Render3D render;
	
	public Screen(int width, int height) {				
		//super means that it is inheriting width & height
		super(width, height);
		
		//will create a random number. (It is needed b/c we need to render a random number of pixels)
		Random random = new Random();
		//create a square of pixels to tell the width and height of the pixels
		//If we set the y to 256, it will offset the y by 256 pixels in the Render class
		test = new Render(256, 256);
		//For the 3D perspective
		render = new Render3D(width, height);
		//Generates random pixels
		for(int i = 0; i < 256 * 256; i++) {
			//(^)Changes the transparency of the pixels by multiplying (random.nextInt(5) / 4)
			//test.pixels[i] = random.nextInt() * (random.nextInt(5) / 4);
			test.pixels[i] = random.nextInt();
		}		
	}
	
	//This render method was inherited from the Render class
	public void render(HandleTime handleTime) {
		//cuts out any pixels that are beyond the set width and height
		for(int i = 0; i < width * height; i++) {
			pixels[i] = 0;
		}
		
		//Draws 256*256 * 500 pixels (Creates a trail)
		for(int i = 0; i < 5; i++) {

			//int animX = (int)(Math.sin((handleTime.time + i) * Math.PI / 500) * 100);
			//int animY = (int)(Math.cos((handleTime.time + i) * Math.PI / 500) * 100);
			//draw(test, (width - 256) / 2 + animX, (height - 256) / 2 +- animY);
		}		
		render.floor();
		draw(render, 0, 0);
	}
}