package tutorials;
import java.util.Date;
public abstract class MyShape {
	
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;

	MyShape(){
		this.dateCreated = new Date();
	}
	
	MyShape(String color, boolean filled){
		this.dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
