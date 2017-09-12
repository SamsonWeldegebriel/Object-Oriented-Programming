package lesson5.interfaceandabstract;


public class Invoice implements Payable {

	String partNumber, partDescription;
	int quantity;
	double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		
		this.partNumber  = partNumber;
		this.partDescription =partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription="
				+ partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + "]";
	}

	
}
