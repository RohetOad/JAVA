package JavaClass;

public class Exercise11_01 {

	public static void main(String[] args) {
    Triangle T1 = new Triangle(1, 1.5, 1);
    T1.setFilled(true);
    T1.setColor("yellow");
    System.out.print("The area of the traingle is: " + T1.getArea() + ",\nThe perimeter of the traingle is: " + T1.getPerimeter() + ",\nThe color of the triangle is: " + T1.getColor() + ",\nThe triangle is filled: " + T1.isFilled());

	}

}

class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled) {
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


class Triangle extends GeometricObject {
	
	//side1, side2, and side3 are 3 sides of triangle. 
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public Triangle() {
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {        
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + "and area =" + getArea();
	}
	
	
}