package lesson5.shapes;


public class Circle extends Shape {
	
	private int radius;

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	
	double calcualteArea(){
		
		return Math.PI * radius * radius;
	}
	
	double calculatePerimeter(){
		return 2 * Math.PI * radius;
	}

}
