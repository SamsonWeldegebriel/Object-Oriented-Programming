package exceptionHandling;
import java.util.*;

/* Write your program to get the input of mark in the range of 0 to 100 from the
console. Apply the necessary Exception handling to avoid negative, nonnumbers.*/

public class Range0To100 {

	public static void main(String[] args) throws OutOfRangeException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter mark in the range of 0 to 100: ");
		try {
			
			int x = in.nextInt();			
			if(x < 0 || x > 100)
				throw new OutOfRangeException();
			System.out.println("The input is: " + x);
		///*
		  } 
		catch(InputMismatchException ex)
		{
			System.out.println(ex.getClass().getSimpleName());
			
		}
		//*/
	}
}

class OutOfRangeException extends Exception{
	
	public OutOfRangeException(){
		System.out.println("Mark value should be from 0 to 100");
	}
}


/* Output:

Enter mark in the range of 0 to 100: 
100
The input is: 100

Enter mark in the range of 0 to 100: 
-5
Mark value should be from 0 to 100
Exception in thread "main" exceptionHandling.OutOfRangeException
	at exceptionHandling.Range0To100.main(Range0To100.java:18)


Enter mark in the range of 0 to 100: 
111
Mark value should be from 0 to 100
Exception in thread "main" exceptionHandling.OutOfRangeException
	at exceptionHandling.Range0To100.main(Range0To100.java:18)

*/