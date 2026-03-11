package graphics;

public class Render {
	public final int width;
	public final int height;
	//Array
	public final int[] pixels;
	
	// The int width & height inside the Render method are assigned to the established width & height
	public Render(int width, int height) {
		this.width = width;
		this.height = height;
		//The number of variables that we are creating is width * height (800 * 500 = 40,000 variables)
		//the 40,000 variables are going to be assigned to pixels
		pixels = new int[width * height];
	}
	
	public void draw(Render render, int xOffset, int yOffset) {
		//For each y pixel created, create each x pixels; for loop within a for loop
		for (int y = 0; y < render.height; y++) {
			//It will be y + whatever the yOffset will be. Ex: if the offset is 5, it will add 5 to y = 0. *It displays the position
			int yPix = y + yOffset;	
			//If the pixels on y-value go beyond the border of the window, continue to render them
			if(yPix < 0 || yPix >= this.height) {
				continue;
			}
			
			for (int x = 0; x < render.width; x++) {
				int xPix = x + xOffset;
				//If the pixels on x-value go beyond the border of the window, continue to render them
				if(xPix < 0 || xPix >= this.width) {
					continue;
				}
				
				int alpha = render.pixels[x + y * render.width];
				//Allows you to change the transparency of the pixels in Screen class (Look for ^ symbol)
				if(alpha > 0) {
					pixels[xPix + yPix * width] = alpha;
				}
				
			}
		}		
		
	}
}