package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import CollectionExample.Geek;

class Geek implements Cloneable {

	String name;
	int id;

	@Override
	public String toString() {
		return "Geek [name=" + name + ", id=" + id + "]";
	}

	Geek(String name, int id) {

		this.name = name;
		this.id = id;
	}

	protected void finalize() {
		System.out.println("finalize");
	}

	@Override
	public boolean equals(Object obj) {

		/*
		 * if (this.hashCode() == obj.hashCode()) return true; return false;
		 */
		/*
		 * if (this.id == ((Geek)obj).id) return true; return false;
		 */
		
		/*
		 * if (this.name.equals(((Geek)obj).name)) return true; return false;
		 */
		
		if (this.name.hashCode() == ((Geek)obj).name.hashCode())
			return true;
		return false;

	}

	
	  @Override public int hashCode() { return this.id; }
	 

	protected Geek clone() throws CloneNotSupportedException {
		return (Geek) super.clone();
	}
}

public class HashMapOverride {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		// creating two Objects with
		// same state

		Geek g1 = new Geek("a", 1);
		Geek g2 = new Geek("b", 2);
		Geek g3 = g2.clone();

		Geek g4 = new Geek("c", 1);

		/*
		 * System.out.println(g1.hashCode()); System.out.println(g3.hashCode());
		 */

		Map<Geek, String> map = new HashMap<Geek, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");
		map.put(g3, "IYT");

		g1 = null;

		System.gc();

		var entrySet = map.entrySet();
		Iterator<Entry<Geek, String>> itr = entrySet.iterator();

		/*
		 * while(itr.hasNext()) { Entry<Geek, String> e = itr.next();
		 * 
		 * }
		 */

		for (var entry : map.entrySet()) {

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

	}

}
