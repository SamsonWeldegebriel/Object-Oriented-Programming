package datetime;

import java.util.Date;
import java.util.*;

public class OldDate {
	
	
	
	public static void main(String[] args) {
		
		Date d = new Date();
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println(d);
		System.out.println(cal.getTime());
		
		System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
		
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc.nextLine());
		
		//Date dob = new Date(2010,03,19);
		GregorianCalendar dob = new GregorianCalendar(2010,03,19);
		
		System.out.println(dob.getTime().getYear());
		
		int age = d.getYear() - dob.getTime().getYear();
		System.out.println("Your age is: " + age);
	}

}
