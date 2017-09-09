package lesson3;

import java.time.*;
import java.time.format.*;
import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	
	MyDate(){}
	
	//DatetimeFormater dt = new DateTimeFormatter("MM/DD/YYYY");
	
	//MM/DD/YYYY  June 14, 2016  DDD YYYY  
	private int year;
	private int month;
	private int date;
	
	enum Months {January, February, March, April, May, June, July, August, September, October, November, December};
	/*
	LocalDate localDate = LocalDate.of(2015, 12, 31);*/

	public MyDate(int MM, int DD, int YYYY) {
		
		this.year = YYYY;
		this.month = MM;
		this.date = DD;
		
	}
	
	public MyDate(String Month, int DD, int YYYY) {
		
		this.year = YYYY;
		this.month = Months.valueOf(Month).ordinal();
		this.date = DD;
		
	}
	public MyDate(int DDD, int YYYY) {		
		
		Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, DDD);
        
        this.month = calendar.MONTH;
        this.date = calendar.DAY_OF_MONTH;
        this.year = YYYY;
        		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
				
	}
	
	public static void main(String[] args)
	{
		
		/* int dayOfYear = 112;
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
	        System.out.println("Day " + dayOfYear + " of the current year = "
	                + calendar.getTime());*/
	        
		char cont;
		do
		{
			
		
		MyDate md = new MyDate();
		System.out.println("Enter 1 for format: MM/DD/YYYY \nEnter 2 for format: Month DD, "
				+ "YYYY \nEnter 3 for format: DDD YYYY  \nEnter 4 to exit Choose your Choice : ");
		
		int formatChoice; 
				Scanner sc = new Scanner(System.in);
				formatChoice = sc.nextInt();
				
				switch(formatChoice)
				{
					case 1:
						System.out.println("Choice: 1 ");
						System.out.println("Enter Month: "); 
						md.month = new Scanner(System.in).nextInt();
						
						System.out.println("Enter Day: ");
						md.date = new Scanner(System.in).nextInt();
						
						System.out.println("Enter Year: "); 
						md.year = new Scanner(System.in).nextInt();
						break;
						
					case 2:
						System.out.println("Choice: 2 ");
						System.out.println("Enter Month in text: "); 
						md.month = new Scanner(System.in).nextInt();
						
						System.out.println("Enter Day: ");
						md.date = new Scanner(System.in).nextInt();
						
						System.out.println("Enter Year: "); 
						md.year = new Scanner(System.in).nextInt();
						 
						break;
					case 3:
						System.out.println("Choice: 3 ");
						//System.out.println("Enter Month in text: "); 
						md.month = new Scanner(System.in).nextInt();
						
						System.out.println("Enter Day of Year: ");
						
						int dayOfYear = new Scanner(System.in).nextInt();
				        Calendar calendar = Calendar.getInstance();
				        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
				        
				        md.month = calendar.MONTH;
				        md.date = calendar.DAY_OF_MONTH;
						
						
						
						System.out.println("Enter Year: "); 
						md.year = new Scanner(System.in).nextInt();
						 
						break;
					case 4:
						return;
					default:
						break;
				}				
				
				/*
				 * MM/dd/yyyy: 08/08/2016 
				 * MMMM dd,yyyy:August 08,2016 
				 * DDD yyyy:221 2016 
				*/
				
				System.out.println("Do you want to Continue : ");
				cont = new Scanner(System.in).next().charAt(0);
				
				if(cont == 'n')
					System.out.println("Terminated");

		}while(cont == 'y');
		
	}

}
