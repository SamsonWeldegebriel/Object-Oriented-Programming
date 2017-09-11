package lesson5.shapes;


public class Rectangle extends Shape {
	
	private int width;
	private int height;

	public Rectangle(String color,int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	double calcualteArea(){
		
		return  width * height;
	}
	
	double calculatePerimeter(){
		return 2 * width + 2 * height;
	}

}
