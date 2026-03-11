package PrinciplesIIShapePoly;

public class Shape {
	private int numOfSides;

	public Shape() {
		
	}
	
	public Shape(int numOfSides) {
		setNumOfSides(numOfSides);
	}

	public int getNumOfSides() {
		return numOfSides;
	}

	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	
	public String toString() {
		return "Number of sides: " + numOfSides;
	}
}
