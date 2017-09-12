package lesson5.interfaceandabstract;


public class CommissionEmployee extends Employee {

	private double grossSales;
	private double CommisionRate;
	public CommissionEmployee(String firstName, String lastName,
			String SocialSecurityNumber, double grossSales, double CommisionRate) {
		super(firstName, lastName, SocialSecurityNumber);

		this.grossSales = grossSales;
		this.CommisionRate = CommisionRate;
	}
	@Override
	public double getPaymentAmount() {
		return grossSales * CommisionRate ;
	}
	
	//Getters and Setters
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return CommisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		CommisionRate = commisionRate;
	}
	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales
				+ ", CommisionRate=" + CommisionRate + ", ="
				+ super.toString() + "]";
	}
	
	

}
