package tutorials;

public class Triangle extends MyShape {

	private double side1 = 1.0 ;
	private double side2 = 1.0 ;
	private double side3 = 1.0 ;
	
	Triangle(){
		
	}
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2 ;
		double Area = Math.sqrt (s * (s - side1) * (s - side2) * (s - side3));
		return Area;
	}
	
	public double getPerimeter() {
		
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	
	public String toString () {
	
		return "Triangle  :"
		+ "\nside 1 = " + side1 
		+ "\nside 2 = " + side2
		+ "\nside 3 = " + side3;
	}
}
