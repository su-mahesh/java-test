package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Employee {

	int id;

	Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object o1) {
		System.out.println(this.id + " equals -> " + ((Employee) o1).id);
		return false;
	}

}

public class HashMapOverriden {

	public static void main(String[] args) {

		HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(3);
		Employee e3 = e1;

		map.put(e1, 1);
//		map.put(new Employee(2), 2);
		map.put(e1, 2);
		map.put(e2, 3);

		System.out.println("size " + map.size());

		System.out.println(map.get(e1));
		System.out.println(map.get(e2));

		Set<Employee> set = new HashSet<Employee>();
		
		set.add(e1);
//		set.add(new Employee(2));
		set.add(e1);
		set.add(e2);
		
		System.out.println("size " + set.size());

	}
}
