package lesson5.interfaceandabstract;

public class PayableMain {

	public static void main(String[] args) {
		
		Payable[] payables = new Payable[5];
		payables[0] = new Invoice("eng-112", "Ford Car Engine", 20, 10);
		payables[1] = new SalariedEmployee("Rashford", "Mikel",
				"111-222-3344", 10000);
		
		payables[2] = new HourlyEmployee("Phil", "Jones",
				"111-222-3344", 1000, 40);
				payables[3] = new CommissionEmployee("Paul", "Pogba",
						"111-222-3344", 20, 40000);
				payables[4] = new BasePlusCommisionEmployee("Zlatan", "Ibrahimovic",
						"111-222-3344", 10, 40000, 20000);
				
				for(Payable p: payables){
					System.out.println(p.toString());
					
				}

	}
	

}
