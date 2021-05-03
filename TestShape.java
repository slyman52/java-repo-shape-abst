package tutorials;

public class TestShape {

	public static void main(String[] args) {
		
		//TRIANGLE
		Triangle myObj =  new Triangle (5,3,4);
		
		System.out.println(myObj.toString());
		System.out.println("Area : " + myObj.getArea() + "m^2");
		System.out.println("Perimeter : " + myObj.getPerimeter() + "m\n");
		
		Triangle myObj2 =  new Triangle ();
		
		System.out.println(myObj2.toString());
		System.out.println("Area : " + myObj2.getArea() + "m^2");
		System.out.println("Perimeter : " + myObj2.getPerimeter() + "m\n");
		
		
		//CIRCLE		
		Circle myCircle =  new Circle ();
		
		System.out.println(myCircle.toString());
		System.out.println("Area : " + myCircle.getArea() + "m^2");
		System.out.println("Perimeter : " + myCircle.getPerimeter() + "m\n");
		
		Circle myCircle2 =  new Circle (5);
		
		System.out.println(myCircle2.toString());
		System.out.println("Area : " + myCircle2.getArea() + "m^2");
		System.out.println("Perimeter : " + myCircle2.getPerimeter() + "m\n");
	}

}
