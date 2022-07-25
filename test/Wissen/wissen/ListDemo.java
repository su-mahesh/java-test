package wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int id;
	String firstName;

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + "]";
	}

	Student(int id, String name) {
		this.id = id;
		this.firstName = name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "c");
		Student s2 = new Student(1, "a");
		Student s3 = new Student(1, "b");

		List<Student> lst = new ArrayList<Student>(Arrays.asList(s1, s2, s3));
		System.out.println(lst);
		Collections.sort(lst, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				var s = o1.firstName.compareTo(o2.firstName);
				System.out.println(o1.firstName+" "+o2.firstName);
				System.out.println(s);
				return s;
			}
		});
		
		
		
		System.out.println(lst);

	}

}
