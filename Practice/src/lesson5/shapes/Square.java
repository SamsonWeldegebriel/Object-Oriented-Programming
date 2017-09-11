package lesson5.shapes;


public class Square extends Rectangle {

	private int side;
	public Square(String color, int side) {
		super(color, side, side);
		this.side = side;
	}
	
	double calcualteArea(){
		
		return  side * side;
	}
	
	double calculatePerimeter(){
		return 4 * side;
	}
	
	

}
