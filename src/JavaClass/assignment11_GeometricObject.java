package JavaClass;

public class assignment11_GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public assignment11_GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	public assignment11_GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
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
	
	public void getDate() {
		 System.out.print(dateCreated + "");
	}

	public String toString() {
		return "The object was created on " + dateCreated + "\n color: " + color + "\n and filled: " + filled;
	}

}
