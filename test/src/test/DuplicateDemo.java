package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Student1 {

	String firstName;
	String latsName;
	String DOB;
	String Contact;

	@Override
	public String toString() {
		return "Student1 [firstName=" + firstName + ", latsName=" + latsName + ", DOB=" + DOB + ", Contact=" + Contact
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Contact, DOB, firstName, latsName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(Contact, other.Contact) && Objects.equals(DOB, other.DOB)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(latsName, other.latsName);
	}

	public Student1(String firstName, String latsName, String dOB, String contact) {
		super();
		this.firstName = firstName;
		this.latsName = latsName;
		DOB = dOB;
		Contact = contact;
	}

	
}

public class DuplicateDemo {

//	static void m(int i) {}
	static void m(double i) {}
	static void m(long i) {}
	static void m(float i) {}
	public static void main(String[] args) {

		m(1f);
		List<Student1> lst = new ArrayList<Student1>(
				Arrays.asList(new Student1("a", "b", "94", "111"), new Student1("t", "b", "94", "1611"),
						new Student1("a", "b", "94", "111"), new Student1("t", "b", "94", "1611")));

		var result = lst.stream().distinct().collect(Collectors.toList());
		
		System.out.println(result);

	}

}
