package tutorials;

public class Circle extends MyShape{

	private double radius = 1.0;
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		double Area = Math.PI * radius * radius;
		return Area;
	}

	
	public double getPerimeter() {
		double Perimeter = Math.PI * 2 * radius;
		return Perimeter;
	}
	
	public String toString () {
		return "Circle  :"
				+ "\nradius : " + radius;
	}
		
		

}
