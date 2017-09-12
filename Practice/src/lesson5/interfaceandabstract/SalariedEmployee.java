package lesson5.interfaceandabstract;


public class SalariedEmployee extends Employee {
	double weeklySalary;

	public SalariedEmployee(String firstName, String lastName,
			String SocialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, SocialSecurityNumber);
		
		this.weeklySalary = weeklySalary;
		
	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary
				+ "," + super.toString() + "]";
	}

	
	

}
