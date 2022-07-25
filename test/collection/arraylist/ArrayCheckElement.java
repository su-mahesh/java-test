package arraylist;

import java.util.ArrayList;

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
	public boolean equals(Object o) { // return o.hashCode() ==
		hashCode();
		return this.id == ((Student) o).id;
	}

//	@Override
//	public int hashCode() {
//		return id;
//	}
	
	public Student clone(){
		try {
			return (Student)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

public class ArrayCheckElement {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(1,"A");
		list.add(new Student(4,"N"));
		list.add(s1);
		list.add(s1);
		
		
		
		System.out.println(list.indexOf(new Student(1,"A")));
		System.out.println(list.contains(s1.clone()));
		System.out.println(list.contains(new Student(1,"A")));
		
	}

}
