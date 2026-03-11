package SubAndSuperClassEx;

import java.util.Date;

//Generate mutator and accessor methods via Source > Generate Getters and Setters

public class GeometryObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometryObject() {
		this.dateCreated = new Date();
	}
	
	public GeometryObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
			
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//Only get the date for the object that was created
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return ("Created on " + dateCreated + "\nColor: " + color + "\nIs Filled: " + filled + "\n");
	}

}
