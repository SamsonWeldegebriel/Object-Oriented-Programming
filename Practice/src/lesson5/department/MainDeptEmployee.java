package lesson5.department;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainDeptEmployee {

	public static void main(String[] args) {
		// three Professor and two instances of Secretary
		
		int totalSalary = 0;
		int totalSecSalary = 0;
		int totalProSalary = 0;
			
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		Professor p1 = new Professor("Renuka", 200000, LocalDate.parse("28-Sep-2010", formatter));
		Professor p2 = new Professor("Alexa", 150000, LocalDate.parse("12-Nov-2014", formatter));
		Professor p3 = new Professor("Minhal", 120000, LocalDate.parse("04-Jun-2016", formatter));
		
		Secretary s1 = new Secretary("Bina", 70000, LocalDate.parse("28-Sep-2010", formatter), 10);
		Secretary s2 = new Secretary("Muna", 70000, LocalDate.parse("28-Sep-2010", formatter), 20);
		
		DeptEmployee[] depemp = new DeptEmployee[5];
		depemp[0] = p1;
		depemp[1] = p2;
		depemp[2] = p3;
		depemp[3] = s1;
		depemp[4] = s2;
		System.out.println(p1.toString());
		
		System.out.println("Do you want to see sum of all salaries:" );
		char c = new Scanner(System.in).nextLine().charAt(0);
		
		if(c == 'Y')
		{
			for(DeptEmployee de : depemp)
			{
				if(de.getClass().getSimpleName().equals("Professor"))
					totalProSalary += de.computeSalary();
				else if(de.getClass().getSimpleName().equals("Secretary"))
					totalSecSalary += de.computeSalary();
				totalSalary += de.computeSalary();
				
			}
			System.out.println(" The Total Professor Salary is: " + totalProSalary);
			System.out.println(" The Total Secretary Salary is: " + totalSecSalary);
			System.out.println(" The Total Salary is: " + totalSalary);
		}
	} 

}
