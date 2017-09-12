package lesson5.shapes;


public class MainShape {
	static double totalArea, totalPerimeter;
	
	public static void printTotal(Shape[] shapes)
	 { 
		 // print the total area of all the Shape objects and print the
		// total perimeter of all the Shape objects
		for(Shape s: shapes)
		{
			totalArea += s.calcualteArea();
			totalPerimeter += s.calculatePerimeter();
			
		}
		System.out.println("Total area is: " + totalArea + " Total perimeter: " + totalPerimeter);
		
		
	 } 

	public static void main(String[] args) {
		
		 Shape[] shapes = new  Shape[5];
		 shapes[0] = new Rectangle("Black", 5, 4);
		 shapes[1] = new Circle("Yellow", 3);
		 shapes[2] = new Square("Black",6);
		 shapes[3] = new Rectangle("Green",2, 3);
		 shapes[4] = new Circle("Red", 7);
		 
		 printTotal(shapes);
	}

}
