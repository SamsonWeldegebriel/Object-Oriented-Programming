package lesson5.department;
import java.time.*;

public class DeptEmployee {
	
	private String name;
	double salary;
	private LocalDate hireDate;

	public DeptEmployee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	double computeSalary()
	{
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "DeptEmployee [name=" + name + ", salary=" + salary
				+ ", hireDate=" + hireDate + "]";
	}
	
	

}
