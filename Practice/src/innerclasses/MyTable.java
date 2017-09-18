package innerclasses;

public class MyTable {
	private int i;
	private Entry[] entries = new Entry[26];
		
	// returns the String that is matched with char c in the table
	public String get(char c) {
		String str = "";
		for(Entry e: entries)
		{
			if(e != null)
				if(e.index == c)
				{					
					str = e.value;
				}
		}
		
		
		return str;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		this.i = c % 97;
		String ch = Character.valueOf(c).toString();
		if(!s.substring(0, 1).equalsIgnoreCase(ch))
		{
			System.out.println("Index:" + ch + " and value:" + s + " miss match! \n");
		}
		else
			entries[i] = new Entry(c,s);
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		String ret = "";
		for(Entry e:entries)
		{
			if(e != null)
			ret = ret + "\n" + e.toString();
		}
		return ret;
	}

	private class Entry {
		private char index;
		private String value;
		
		Entry(char ch, String str) {
			
			this.index = ch;
			this.value = str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			String str = index + "->" + value;
			return str;
		}
	}
	
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		t.add('j', "Rock");
		t.add('s', "Samson");
		String s = t.get('b');
		System.out.println("The value of get(b):"+s);
		System.out.println(t);
	}
}

/* Out put:
 * 
Index:j and value:Rock miss match! 

The value of get(b):Billy

a->Andrew
b->Billy
c->Charlie
s->Samson
*/
