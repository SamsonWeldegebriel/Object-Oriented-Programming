package lesson3;

import java.util.Scanner;

final class Triangle
{
	private final double base, height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
	public double computeArea() 
	{
		return 0.5 * base * height;
	}
}

final class Rectangle
{
	private  final double width, length;
	public Rectangle(double width, double length)  {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}	
	
	public double computeArea() 
	{
		return width * length;
	}
	
}

final class Circle
{
	private  final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() 
	{
		return Math.PI * radius * radius;
	}
}

public class Shapes {

	public static void main(String[] args) 
	{
		
		/*
		 * 
		 * Enter C for Circle 
		 * Enter R for Rectangle 
		 * Enter T for Triangle 
		 * R 
		 * Enter the width of the Rectangle  120 
		 * Enter the height of the Rectangle 200 
		 * The area of Rectangle is : 24000.00
		 * 
		 *  
		 * */
		
		System.out.println("Enter C for Circle \nEnter R for Rectangle "
				+ "YYYY \nEnter T for Triangle  ");

		char shapeChooser;
		Scanner sc = new Scanner(System.in);
		shapeChooser = sc.nextLine().charAt(0);

		switch (shapeChooser) {
		
		case 'C':
			int r;
			
			System.out.println("Enter the radius of the Circle:");
			r = new Scanner(System.in).nextInt();

			Circle cir = new Circle(r);
			System.out.println("The area of Circle is : " + cir.computeArea());
			break;
			
		case 'R':
			int w, h;
			
			System.out.println("Enter the width of the Rectangle:");
			w = new Scanner(System.in).nextInt();

			System.out.println("Enter the height of the Rectangle:");
			h = new Scanner(System.in).nextInt();
			
			Rectangle rec = new Rectangle(w,h);
			System.out.println("The area of Rectangle is : " + rec.computeArea());
			break;

		case 'T':
			int ba, he;
			
			System.out.println("Enter the base of the Triangle:");
			ba = new Scanner(System.in).nextInt();

			System.out.println("Enter the height of the Triangle:");
			he = new Scanner(System.in).nextInt();
			
			Triangle tri = new Triangle(ba,he);
			System.out.println("The area of Triangle is : " + tri.computeArea());
			break;
		
		default:
			break;
		}
		
		
	}

}


/*
 * 
 * Out put:
 * 
 * 
Enter C for Circle 
Enter R for Rectangle YYYY 
Enter T for Triangle  
C
Enter the radius of the Circle:
12
The area of Circle is : 452.3893421169302
*
*
*
Enter C for Circle 
Enter R for Rectangle YYYY 
Enter T for Triangle  
R
Enter the width of the Rectangle:
12
Enter the height of the Rectangle:
20
The area of Rectangle is : 240.0

*
*
*
*
Enter C for Circle 
Enter R for Rectangle YYYY 
Enter T for Triangle  
T
Enter the base of the Triangle:
12
Enter the height of the Triangle:
20
The area of Triangle is : 120.0
*
*
*/
