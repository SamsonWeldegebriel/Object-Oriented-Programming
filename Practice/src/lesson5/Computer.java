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
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
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
		return getDiskSize() * getProcessorSpeed();
	}

	//Override the toString() method to display the current status
	@Override
	
	public String toString(){
		String str;
		str = "[" + this.manufacturer + ", " + this.processor + ", " + this.ramSize+ ", " + this.diskSize+ ", " + this.processorSpeed +"]";
		return str;
	}
	
	// manufacturer, processor,  ramSize, diskSize, processorSpeed
	
	//Override the equals() and hashCode() method for the Computer class.

	@Override
	public boolean equals(Object ob)
	{
		if(ob == null) return false;
		if(ob instanceof Computer)
		{
			Computer c = (Computer) ob;
			if(this.manufacturer.equals(c.manufacturer) && this.processor.equals(c.processor) &&
				this.ramSize == c.ramSize && this.diskSize == c.diskSize && 
				this.processorSpeed == c.processorSpeed	)
			return true;
		}		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		
		int hashcode = 7 * manufacturer.hashCode() * processor.hashCode() * Integer.valueOf(ramSize)  * Integer.valueOf(ramSize).hashCode()  * Integer.valueOf(diskSize).hashCode() * Double.valueOf(processorSpeed).hashCode() ;
		return hashcode;
	}
	

	public static void main(String[] args) {

		Computer c1 = new Computer("Dell","intel i-5", 8, 500, 2.3);
		Computer c2 = new Computer("Dell","intel i-5", 8, 500, 2.3);
		Computer c3 = new Computer("Acer","intel i-7", 4, 100, 2.3);
		
		System.out.println(c1.toString());
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

	}




}
