package lesson3;

import java.time.*;
import java.time.format.*;
import java.util.Calendar;
import java.util.Scanner;

public class MyDate {

	private int year;
	private int month;
	private int date;

	enum Months {
		January, February, March, April, May, June, July, August, September, October, November, December
	};

	public MyDate(int MM, int DD, int YYYY) {

		this.year = YYYY;
		this.month = MM;
		this.date = DD;

	}

	public MyDate(String Month, int DD, int YYYY) {

		this.year = YYYY;
		this.month = Months.valueOf(Month).ordinal()+1;	
		this.date = DD;

	}

	public MyDate(int DDD, int YYYY) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, DDD);

		this.year = YYYY;
		this.month = calendar.getTime().getMonth()+1;
		this.date = calendar.getTime().getDate()-1;

	}

	public static void datePrint(MyDate mydate) {
		/*
		 * 08/08/2016 August 08,2016 221 2016
		 */

		LocalDate localDate = LocalDate.of(mydate.year, mydate.month, mydate.date);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("DDD yyyy");

		String ld1 = localDate.format(formatter1);
		String ld2 = localDate.format(formatter2);
		String ld3 = localDate.format(formatter3);

		System.out.println("MM/dd/yyyy:" + ld1);
		System.out.println("MMMM dd,yyyy:" + ld2);
		System.out.println("DDD yyyy:" + ld3);

	}

	public static void main(String[] args) {

		int m, d, y;
		String mon;

		char cont;
		do {

			MyDate md; // = new MyDate();
			System.out.println("Enter 1 for format: MM/DD/YYYY \nEnter 2 for format: Month DD, "
					+ "YYYY \nEnter 3 for format: DDD YYYY  \nEnter 4 to exit Choose your Choice : ");

			int formatChoice;
			Scanner sc = new Scanner(System.in);
			formatChoice = sc.nextInt();

			switch (formatChoice) {
			case 1:
				System.out.println("Choice: 1 ");
				System.out.println("Enter Month: ");
				m = new Scanner(System.in).nextInt();

				System.out.println("Enter Day: ");
				d = new Scanner(System.in).nextInt();

				System.out.println("Enter Year: ");
				y = new Scanner(System.in).nextInt();

				md = new MyDate(m, d, y);
				md.datePrint(md);
				break;

			case 2:
				System.out.println("Choice: 2 ");
				System.out.println("Enter Month in text: ");
				mon = new Scanner(System.in).nextLine();
				System.out.println("Enter Day: ");
				d = new Scanner(System.in).nextInt();

				System.out.println("Enter Year: ");
				y = new Scanner(System.in).nextInt();

				md = new MyDate(mon, d, y);
				md.datePrint(md);
				break;
			case 3:
				System.out.println("Choice: 3 ");
				// System.out.println("Enter Month in text: ");

				System.out.println("Enter Day of Year: ");
				int dayOfYear = new Scanner(System.in).nextInt();
				
				System.out.println("Enter Year: ");
				y = new Scanner(System.in).nextInt();
				
				md = new MyDate(dayOfYear, y);
				md.datePrint(md);
				break;
			case 4:
				return;
			default:
				break;
			}

			System.out.println("Do you want to Continue : ");
			cont = new Scanner(System.in).next().charAt(0);

			if (cont == 'n')
				System.out.println("Terminated");

		} while (cont == 'y');

	}

}

/*
 * Output:
 * 
 * Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY 
Enter 3 for format: DDD YYYY  
Enter 4 to exit Choose your Choice : 
1
Choice: 1 
Enter Month: 
12
Enter Day: 
28
Enter Year: 
2015
MM/dd/yyyy:12/28/2015
MMMM dd,yyyy:December 28,2015
DDD yyyy:362 2015
Do you want to Continue : 
y
Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY 
Enter 3 for format: DDD YYYY  
Enter 4 to exit Choose your Choice : 
2
Choice: 2 
Enter Month in text: 
January
Enter Day: 
26
Enter Year: 
2005
MM/dd/yyyy:01/26/2005
MMMM dd,yyyy:January 26,2005
DDD yyyy:026 2005
Do you want to Continue : 
y
Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY 
Enter 3 for format: DDD YYYY  
Enter 4 to exit Choose your Choice : 
3
Choice: 3 
Enter Day of Year: 
221
Enter Year: 
2016
MM/dd/yyyy:08/08/2016
MMMM dd,yyyy:August 08,2016
DDD yyyy:221 2016
Do you want to Continue : 
n
Terminated
 * 
 */
