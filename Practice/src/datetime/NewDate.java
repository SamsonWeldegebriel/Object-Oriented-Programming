package datetime;

import java.time.*;
import java.util.Scanner;


public class NewDate {
	
	static int ageCalculator(LocalDate dob)
	{
		
		LocalDate now = LocalDate.now();
		Period p = Period.between(dob, now);
		return p.getYears();
				
	}

	public static void main(String[] args) {
		int age, year, month, dayOfMonth;
		
		System.out.println("Enter Birth Year");
		year = new Scanner(System.in).nextInt();
		System.out.println("Enter Birth Month");
		month = new Scanner(System.in).nextInt();
		System.out.println("Enter Birth day");
		dayOfMonth = new Scanner(System.in).nextInt();
		
		LocalDate dob = LocalDate.of(year, month, dayOfMonth);
		
		age = ageCalculator(dob);
		
		System.out.println("Your age is: " + age);
	}
}
