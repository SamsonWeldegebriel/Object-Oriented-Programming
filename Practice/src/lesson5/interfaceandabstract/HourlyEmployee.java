package lesson5.interfaceandabstract;


public class HourlyEmployee extends Employee {

	double wage, hours;
	public HourlyEmployee(String firstName, String lastName,
			String SocialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, SocialSecurityNumber);
		
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {		
		return wage * hours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours
				+ ", =" + super.toString() + "]";
	}
	
	

}
