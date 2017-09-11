package lesson5.department;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	private int numberOfPublications;
	
	public Professor(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	

}
