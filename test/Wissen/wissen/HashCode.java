package wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employee implements Cloneable {
	int id;
	String name;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
	 @Override public int hashCode() { 
		 return this.id;
		// return 0; 
	 }
	 
		/*
		 * @Override public boolean equals(Object o) { return ((Employee) o).id ==
		 * this.id; //return false; //return true; }
		 */
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
}

public class HashCode {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e = new Employee(1, "A");
		Employee e1 = new Employee(5, "V");
		Employee e2 = new Employee(4, "A");
		Employee e3 = new Employee(2, "A");
		Employee e4 = new Employee(2, "A");

		/*
		 * System.out.println(e.hashCode()); System.out.println(e.clone().hashCode());
		 */

		Set<Employee> set = new HashSet<Employee>();

		set.add(e);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);

		System.out.println(set);
		
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(1,2,4));
		
		lst.remove((Integer)1);

	}

}
