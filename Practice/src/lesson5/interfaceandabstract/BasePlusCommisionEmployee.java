package lesson5.interfaceandabstract;


public class BasePlusCommisionEmployee extends CommissionEmployee {

	double baseSalary;
	public BasePlusCommisionEmployee(String firstName, String lastName,
			String SocialSecurityNumber, double grossSales, double CommisionRate, double baseSalary) {
		super(firstName, lastName, SocialSecurityNumber ,  grossSales, CommisionRate);

		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmount() {
		return  baseSalary + (getGrossSales() * getCommisionRate());
	}

	@Override
	public String toString() {
		return "BasePlusCommisionEmployee [baseSalary=" + baseSalary
				+ ", =" + super.toString() + "]";
	}

	
	
	

}
