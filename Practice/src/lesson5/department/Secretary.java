package lesson5.department;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;

	public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	double computeSalary()
	{
		return salary + (getOvertimeHours() * 12);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	

}
