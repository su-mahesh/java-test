package hashset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Student implements Cloneable {
	int id;
	String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) { 
		hashCode();
		return this.id == ((Student) o).id;
	}

}

class comp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.compareTo(o1);
	}

}

public class SortHashSet {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(9);
		hs.add(6);
		hs.add(1);
		hs.add(3);

		TreeSet<Integer> t = new TreeSet<Integer>(new comp());
		t.addAll(hs);
		System.out.println(t);
		
		HashSet<Student> st = new HashSet<Student>();
		
	}

}
