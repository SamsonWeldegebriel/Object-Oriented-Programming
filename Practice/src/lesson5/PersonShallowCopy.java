package lesson5;

public class PersonShallowCopy {

	String name;
	Computer computer;
	public PersonShallowCopy(String name, Computer computer) {
			this.name = name;
			this.computer = computer;
		
	}
	//Shallow copy
	
	public Object clone() throws CloneNotSupportedException
	{
		PersonShallowCopy p1 = new PersonShallowCopy(this.name, this.computer);		
		return p1;
	}
	
	
	
	
	
	/*
	a. Apply clone() method and write the implementation to understand the concepts of
	shallow copy.
	b. Apply clone() method and write the implementation to understand the concepts of
	deep copy.
	*/

	@Override
	public String toString() {
		return "PersonShallowCopy [name=" + name + ", computer=" + computer + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Computer c1 = new Computer("Dell", "Itel-Core-i6", 6, 800, 2.8);
		PersonShallowCopy psc1 = new PersonShallowCopy("Alexander", c1);
		
		PersonShallowCopy psc2 = (PersonShallowCopy) psc1.clone();		
		
		System.out.println(psc1);
		System.out.println(psc2);
		
		c1.manufacturer = "HP";
		psc2.name = "Abera";
		
		System.out.println(psc1);
		System.out.println(psc2);

	}

}

/*
 * 
 * PersonShallowCopy [name=Alexander, computer=[Dell, Itel-Core-i6, 6, 800, 2.8]]
PersonShallowCopy [name=Alexander, computer=[Dell, Itel-Core-i6, 6, 800, 2.8]]
PersonShallowCopy [name=Alexander, computer=[HP, Itel-Core-i6, 6, 800, 2.8]]
PersonShallowCopy [name=Abera, computer=[HP, Itel-Core-i6, 6, 800, 2.8]]

 * 
 */
