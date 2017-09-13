package lesson5;

public class PersonDeepCopy {

	String name;
	Computer computer;
	public PersonDeepCopy(String name, Computer computer) {
			this.name = name;
			this.computer = computer;
		
	}
	//Shallow copy
	
	public Object clone() throws CloneNotSupportedException
	{
		PersonDeepCopy p1 = new PersonDeepCopy(this.name, this.computer);;
		p1.computer = (Computer) computer.clone();		
		return p1;
	}
	
	
	
	/*
	a. Apply clone() method and write the implementation to understand the concepts of
	shallow copy.
	b. Apply clone() method and write the implementation to understand the concepts of
	deep copy.
	*/

	public String toString() {
		return "PersonDeepCopy [name=" + name + ", computer=" + computer + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Computer c1 = new Computer("Dell", "Itel-Core-i6", 6, 800, 2.8);
		PersonDeepCopy pdc1 = new PersonDeepCopy("Alexander", c1);
		
		PersonDeepCopy pdc2 = (PersonDeepCopy) pdc1.clone();		
		
		System.out.println(pdc1);
		System.out.println(pdc2);
		
		c1.manufacturer = "HP";
		pdc1.name = "Abera";
		
		System.out.println(pdc1);
		System.out.println(pdc2);

	}

}
