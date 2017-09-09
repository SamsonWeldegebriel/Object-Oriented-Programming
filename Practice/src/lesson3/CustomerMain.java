package lesson3;

public class CustomerMain {

	public static void main(String[] args) {

		Address c1BA = new Address("144 Kings Highway","Chicago","IL", "19901");
		Address c2BA = new Address("11522 Shawnee Road","Greenwood","DE", "19950");
		Address c3BA = new Address("Humes Realty 33 Bridle Ridge Court","Chicago","IL", "19958");
		
		Address c1SA = new Address("2284 Bryn Zion Road","Chicago","IL", "19904");
		Address c2SA = new Address("VEI Dover Crossroads","Baltimore","MD", "21580");
		Address c3SA = new Address("580 North Dupont Highway","Dupont","DE", "19923");
		
		Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
		Customer c2 = new Customer("Wyne", "Rooney", "123-221-4444");
		Customer c3 = new Customer("Christiano", "Ronaldo", "555-221-4444");
		
		c1.setBillingAddress(c1BA);
		c2.setBillingAddress(c2BA);
		c3.setBillingAddress(c3BA);
		
		c1.setShippingAddress(c1SA);
		c2.setShippingAddress(c2SA);
		c3.setShippingAddress(c3SA);
		
		Customer[] customers = {c1, c2, c3};
		
		for(Customer c: customers)
		{
			if(c.getBillingAddress().getCity().equals("Chicago"))
			{
				System.out.println(c.toString());
			}
		}
		

	}

}
