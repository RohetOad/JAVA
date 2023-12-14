/*
 Project: The Circle2D Class
Problem Description:
Define the Circle2D class that contains:
 Two double data fields named x and y that specify the
center of the circle with get methods.
 A data field radius with a get method.
 A no-arg constructor that creates a default circle
with (0, 0) for (x, y) and 1 for radius.
 A constructor that creates a circle with the specified
x, y, and radius.
 A method getArea() that returns the area of the
circle.
 A method getPerimeter() that returns the perimeter of
the circle.
 A method contains(double x, double y) that returns
true if the specified point (x, y) is inside this
circle. See Figure 10.14(a).
 A method contains(Circle2D circle) that returns true
if the specified circle is inside this circle. See
Figure 10.14(b).
 A method overlaps(Circle2D circle) that returns true
if the specified circle overlaps with this circle.

Write a test program that creates a Circle2D
object c1 (new Circle2D(2, 2, 5.5)), displays its area
and perimeter, and displays the result of
c1.contains(3, 3), c1.contains(new Circle2D(4, 5,
10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)).
 */



package JavaClass;

public class circle2D_Exercise10_11 {

	public static void main(String[] args) {
	    circle2D c1 = new circle2D(2, 2, 5.5);
	    System.out.println("Area is " + c1.getArea());
	    System.out.println("Perimeter is " + c1.getPerimeter());
	    System.out.println(c1.contains(3, 3));
	    System.out.println(c1.contains(new circle2D(4, 5, 10.5)));
	    System.out.println(c1.overlaps(new circle2D(3, 5, 2.3)));


	}

}

class circle2D{
	private double x = 0;
	private double y = 0;
	private double radius = 1;
	
	public circle2D(){		
	}
	
	public circle2D(double x, double y, double radius) {
		this.radius = radius;
		this.x = x;
		this.y = y;				
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 3.1415*(Math.pow(radius, 2));
	}
	
	public double getPerimeter() {
		return 2*3.1415*radius;
	}
	
	//check if the given point is inside the circle or not.
	public boolean contains(double x, double y) {
		if(Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius)
			return true;
		else return 
				false;
	}
	
	//check if the given circle is inside the circle object.
	public boolean contains(circle2D circle) {
		if(Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2)) + circle.radius < radius)
			return true;
		else 
			return false;
	}
	
	//check if the given circle overlaps the circle object. 
	public boolean overlaps(circle2D circle) {
		if(Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2)) < radius + circle.radius)
			return true;
		else 
			return false;
	}
	
}
