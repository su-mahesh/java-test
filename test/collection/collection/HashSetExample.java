package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import CollectionExample.Stud;
class Stud implements Cloneable {
	int id;

	@Override
	public String toString() {
		return "Stud [id=" + id + "]";
	}

	public Stud(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		return id == other.id;
	}

	protected Stud clone() throws CloneNotSupportedException {
		return (Stud) super.clone();
	}
	
}
public class HashSetExample {

	public static void print()
	{
		HashSet<String> set=new HashSet<String>(); 
		String s = new String("asdfgh");
		String s1 = new String("asdfgh");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		Integer i = 122;
		Integer i1 = 122;
		
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
		
		List l = new ArrayList();
		
		List l1 = new ArrayList();
		
		System.out.println(l.hashCode());
		System.out.println(l1.hashCode());
		
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five"); 
        set.add("One");
        set.add(s);
        set.add(s1);
        
        
        System.out.println(set);
		/*
		 * Iterator<String> i = set.iterator();
		 * 
		 * for(var item : set) { System.out.println(item+" "+item.hashCode()); }
		 */
        
		/*
		 * set.remove(null); System.out.println(); for(var item : set) {
		 * System.out.println(item+" "+item.hashCode()); }
		 */
        /*while(i.hasNext())  
        {  
        System.out.println(i.next()+" "+i.hashCode());  
        }  */
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
	
		
	//	print();
		Set<Stud> s = new HashSet<Stud>();
		
		s.add(new Stud(1));
		s.add(new Stud(1));
		
		System.out.println(s);
	}

}
