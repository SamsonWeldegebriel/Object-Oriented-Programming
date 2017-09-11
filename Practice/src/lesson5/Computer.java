package lesson5;

public class Computer {
	
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	public Computer(String manufacturer,String processor, int ramSize, 
			int diskSize, double processorSpeed) {
		// Make a Constructor to initialize the instance fields
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	} 
	
	double computePower()
	{// return ramSize multiplied by processorSpeed
		return 0.0;
	}

	//Override the toString() method to display the current status
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", processor="
				+ processor + ", ramSize=" + ramSize + ", diskSize=" + diskSize
				+ ", processorSpeed=" + processorSpeed + "]";
	}
	
	//Override the equals() and hashCode() method for the Computer class.

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (diskSize != other.diskSize)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (Double.doubleToLongBits(processorSpeed) != Double
				.doubleToLongBits(other.processorSpeed))
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diskSize;
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
		return result;
	}
	
	

	public static void main(String[] args) {

		Computer c1 = new Computer("Dell","intel i-5", 8, 500, 2.3);
		Computer c2 = new Computer("Dell","intel i-5", 8, 500, 2.3);
		Computer c3 = new Computer("Acer","intel i-7", 4, 1000, 2.0);
		
		System.out.println(c1.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c1.hashCode());

	}




}
