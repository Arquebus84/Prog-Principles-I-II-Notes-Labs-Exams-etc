package PrinciplesIIShapePoly;

public class Triangle extends Shape {
	//private int sides = 3;
	double sideA, sideB, sideC;

	public Triangle() {
		this(3.0, 4.0, 5.0);
	}
	
    public Triangle(double sideA, double sideB, double sideC) {
    	super(3);
    	this.sideA = sideA;
    	this.sideB = sideB;
    	this.sideC = sideC;
    }
        
    public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public String toString(){
        return "Sides: A = " + sideA + ", B = " + sideB + " C = " + sideC;
    }
}
