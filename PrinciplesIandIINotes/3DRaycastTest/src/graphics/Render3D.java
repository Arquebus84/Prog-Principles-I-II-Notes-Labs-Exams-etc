package graphics;

public class Render3D extends Render {

	public Render3D(int width, int height) {
		super(width, height);		
	}
	
	double time = 0;
	
	public void floor() {		
		for(int y = 0; y < height; y++) {
			double ceiling = (y - height / 2.0) / height;
			if(ceiling < 0) {
				ceiling = -ceiling;
			}
			double z = 8 / ceiling;
			time += 0.00005;
			
			for(int x = 0; x < width; x++) {
				double depth = (x - width / 2.0) / height;
				depth *= z;
				//Use this (>> (means shift)) to make the perspective look more spaced out. (ex: xDepth >> 5)
				
				/**		<< (bit shift left) means to double; >> (bit shift right) means to half it
				 * Example:
				 * 				110 = 6		
				 * 		x << 1				x >> 1
				 * 	  1100 = 12			   11 = 3
				 * 
				 * */
				
				//Use & (& is a bitwise operator) for & 5 to copy one side to the other (makes it look 3D)
				double xx = (depth + time);
				double yy = (z + time);
				int xPixel = (int) (xx) & 15;
				int yPixel = (int) (yy) & 15;
				//multiply xx by 128 (or -128 to flip along the y-axis) for blue and black lines
				pixels[x + y * width] = (xPixel * 16) | (yPixel * 16) >> 0;
			}
		}
	}
	
}
