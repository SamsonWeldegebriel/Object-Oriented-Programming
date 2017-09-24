package exceptionHandling;

public class CustomerAccount {
	
	/*
	 * Create a user defined exception to handle the following situation
		1. Withdraw amount exceed the balance
		2. Balance reach below 100$.
	*/
	
		private String cus_name, acc_No;
		private double balance;
		
		public CustomerAccount(String cus_name, String acc_No, double balance) {
			this.acc_No = acc_No;
			this.balance = balance;
			this.cus_name = cus_name;
		}
		
		
		void  deposit(int amount)
		 {
			 //– Used to increase the balance
			balance = balance + amount;
		 }
		 void Withdraw(double amount) throws ExceedBalance, LowBalanceException
		 {
			 //– Used to reduce the balance. 
			 if(amount > balance)
				 throw new ExceedBalance();
			 
			 balance = balance - amount;
			 
			 if(balance < 100)
			 {
				 throw new LowBalanceException();
			 }
			 
			 
		 }
		 
		 public static void main(String[] args) throws ExceedBalance, LowBalanceException {
			CustomerAccount acc1 = new CustomerAccount("Samson", "1000100", 10000);
			CustomerAccount acc2 = new CustomerAccount("Rashford", "2000200", 4000);
			CustomerAccount acc3 = new CustomerAccount("Marshal", "3000300", 5000);
			
			//acc1.Withdraw(11000);
			acc2.Withdraw(3910);
		}

}

	class ExceedBalance extends Exception{
		public ExceedBalance() {
			System.out.println("Withdraw amount exceed the balance");
		}
	}
	
	class LowBalanceException extends Exception{
		public LowBalanceException() {
			System.out.println("Balance reach below 100$.");
		}
	}
	
	/* Output:: 
	 * 
	 * 1-  Withdraw amount exceed the balance
			Exception in thread "main" exceptionHandling.ExceedBalance
			at exceptionHandling.CustomerAccount.Withdraw(CustomerAccount.java:30)
			at exceptionHandling.CustomerAccount.main(CustomerAccount.java:47)
				
		2- Balance reach below 100$.
			Exception in thread "main" exceptionHandling.LowBalanceException
			at exceptionHandling.CustomerAccount.Withdraw(CustomerAccount.java:36)
			at exceptionHandling.CustomerAccount.main(CustomerAccount.java:48)
	
	 * */
