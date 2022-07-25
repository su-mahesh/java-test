package collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	int id;
	String name;

	Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		int c = Integer.compare(id, o.id);
		System.out.println(id+" com "+o.id+" : "+c);
		return c;
	}

	public String toString() {
		return "{id: "+id+", name: "+name+"}";
	}
}

public class CollectionExample {

	public static void main(String[] args) {

		List<Employee> lst = new ArrayList<Employee>(Arrays.asList(
				new Employee(1, "A"), new Employee(2, "B"),
				 new Employee(5, "C"),  new Employee(4, "D")));

		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
	}
}
