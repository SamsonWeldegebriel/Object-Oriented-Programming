package lesson5.interfaceandabstract;

public abstract class Employee implements Payable {
	
	private String firstName;
	private String lastName;
	private String SocialSecurityNumber;

	public Employee(String firstName, String lastName, String SocialSecurityNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.SocialSecurityNumber = SocialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", SocialSecurityNumber=" + SocialSecurityNumber + "]";
	}

	/*
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	

}
