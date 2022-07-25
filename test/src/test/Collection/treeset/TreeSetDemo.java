package test.Collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {

	Integer id;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public Employee(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(Object o) {
		if (o.getClass() == Student.class) {
			Student t = (Student)o;
		}
		return 1;
	}

	

}

class Student implements Comparable<Student> {

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	Integer id;

	Student(int id) {
		this.id = id;
	}

	public int compareTo(Student o2) {
		return id.compareTo(o2.id);
	}

}

class MyComaparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 < o2)
			return 1;
		else if (o1 > o2)
			return -1;
		else
			return o1.compareTo(o2);

//		return o2.compareTo(o1);
		// return -o1.compareTo(o2);
		// return -1;
	}
}

class MyStringLengthComaparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		if (o1.length() > o2.length())
			return 1;
		else if (o1.length() < o2.length())
			return -1;
		else
			return o1.compareTo(o2);

	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		
		
		
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComaparator());

		t.add(10);
		t.add(10);
		t.add(1);
		t.add(4);

//		System.out.println(t);

		TreeSet<String> t1 = new TreeSet<String>(new MyStringLengthComaparator());

		t1.add("adsgse");
		t1.add("aa");
		t1.add("aera");
		t1.add("aaaa");
		t1.add("cc");
		t1.add("GG");
		t1.add("gg");

		// System.out.println(t1);

		TreeSet studs = new TreeSet();
		
		
		studs.add(new Student(7));
		studs.add(new Student(1));
		studs.add(new Student(5));
		studs.add(new Employee(1));
		studs.add(new Employee(8));
		

		System.out.println(studs);
	}

}

