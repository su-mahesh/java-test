package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import CollectionExample.Student;

class Student {

	int id;
	String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// System.out.println("s");
		// return this.name.hashCode();
		// return 0;
		return new Random().nextInt();
	}

	@Override
	public boolean equals(Object obj) {

		// return ((Integer)hashCode()).equals(((Student)obj).hashCode());
		return false;

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class CollectionExample {

	public static int a() {
		System.out.println("a");
		return 1;
	}

	public static int b() {
		System.out.println("b");
		return 1;
	}

	public static int c() {
		System.out.println("c");
		return 1;
	}

	public static void d(int a, int b, int c) {

		System.out.println(c);
	}

	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		d(j, ++i, i++);

		Student stud1 = new Student(1, "A");
		Student stud2 = new Student(2, "B");
		Student stud3 = new Student(3, "C");
		Student stud4 = new Student(4, "D");

		HashMap<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(stud1, 1);
		map.put(stud2, 1);
		map.put(stud3, 1);
		map.put(stud4, 1);
		map.put(stud1, 2);

		List<Object> l;

		Vector v = new Vector();
		Vector<Integer> v1 = new Vector<Integer>();
		
		Map m;
	
		
		
		
		Set t;
		
		Enumeration<Integer> e = v.elements();
		Enumeration e1 = v1.elements();

		
		e.nextElement();
		e1.nextElement();
		/*
		 * map.putIfAbsent(stud1, 1); map.putIfAbsent(stud2, 1); map.putIfAbsent(stud3,
		 * 1); map.putIfAbsent(stud4, 1); map.putIfAbsent(stud1, 2);
		 */

		System.out.println(map.keySet());

		ArrayList<Integer> s = new ArrayList<Integer>();

	}

}
