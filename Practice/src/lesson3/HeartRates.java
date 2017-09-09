package lesson3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class HeartRates {
	
	String  firstName, lastName;
	LocalDate dateOfBirth;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
	//LocalDate birthDate;
	
	static final int RHR = 70;
	static final double LB  = 0.5;
	static final double UB = 0.85;		
	private int MHR;
	
	/*public HeartRates() {
		
	}*/
	
	public HeartRates(String firstName,String lastName,LocalDate dateOfBirth)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
		   
	    

		public int calculateAge(LocalDate birthday) {
	    	
	        LocalDate today = LocalDate.now();
	        Period p = Period.between(birthday, today);
	        int year = p.getYears();
	        return year;
	    }
	    
		public void setMHR(int mHR) {
			this.MHR = 220 - calculateAge(dateOfBirth);
		}
		
	    public int getMHR() {
	    	return this.MHR;
	    }
	    
	    public String calculateTargetHeartRateRange() {
	    	int averageHeartrate;
	    	averageHeartrate = getMHR() - RHR;
	    	double LBTHR = averageHeartrate*LB + RHR;
	    	double UBTHR = averageHeartrate*UB + RHR;
	    	
	    	System.out.println("The  target heart rate range is between " + LBTHR + "and " + UBTHR);
	    	return "The  target heart rate range is between " + LBTHR + "and " + UBTHR;
	    }
	    
	    /*  first name, last name and date of birth,  person’s age in (years), maximum heart rate(MHR)
	     *   and target-heart-rate range*/
	    
	    public String toString()
	    {	    	
	    	return "[" + firstName + " " + lastName + " was born on " +  dateOfBirth + " and is " +
	    			calculateAge(dateOfBirth) + " years old with "  + "MHR of: " + MHR + "]";
	    }
	
	    public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			dateOfBirth = dateOfBirth;	
		}
		
		

		

		public static void main(String[] args)
	    {
			LocalDate ld = LocalDate.parse("1975-5-18", HeartRates.formatter);
	    	HeartRates hr = new HeartRates("Jose", "Morinho", ld);
	    	hr.setMHR(hr.MHR);
	    	
	    	//LocalDate birthDay = LocalDate(2012,12,1);
	    	//System.out.println(hr.calculateAge(hr.birthDate));

	    	System.out.println(hr.toString());
	    }

}

/*
 * 
 * Output:
 * 
 * [Jose Morinho was born on 1975-05-18 and is 42 years old with MHR of: 178]
 */
