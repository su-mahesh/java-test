package java8.Stream.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


class Person {
	
	String name;
	Integer age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, Integer age) {
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void finalize()
    {
        System.out.println("finalize method is called");
    }
}

class Employee {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary+"\n";
	}
}

public class CollectorsExample {
	
	public static void noOfMaleAndFemaleEmployees(List<Employee> employeeList) {
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(c -> c.gender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
	}
	
	public static void fun(List<Employee> employeeList) {
		
		HashMap hashmap = employeeList.stream().collect(
				// to Map if no duplicate keys
				Collectors.toMap(c -> c.department, c -> c.age, (a, b) -> b, () -> new HashMap()));
		// to map if duplicate keys exist
		// Collectors.toMap(c -> c.id, c -> c.yearOfJoining));

		System.out.println(hashmap);

		Map<String, Set<Employee>> res = employeeList.stream().collect(Collectors.groupingBy(c -> c.gender, Collectors.toSet()));

		System.out.println(res);

		var res1 = employeeList.stream().min(Comparator.comparing(c -> c.age)).orElse(null);

		System.out.println("min age employee: " + res1);

		Person alex = new Person("Alex", 23);
		Person john = new Person("John", 40);
		Person peter = new Person("Peter", 32);
		List<Person> people = Arrays.asList(alex, john, peter);

		Person minByAge = people.stream().min(Comparator.comparing(Person::getAge)).orElse(null);

		var min = people.stream().min((a, b) -> a.age.compareTo(b.age) // Comparator.comparing(Person::getAge)
		).orElse(null);

		System.out.println(min);

		var min1 = people.stream().collect(Collectors.minBy((a, b) -> a.age.compareTo(b.age))).orElse(null);
		
		System.out.println(min1);
		
		var res2 = employeeList.stream().map(c -> c.salary).reduce(0d, (a, b) -> a + b);
		System.out.println(res2);
		
		Double sumOfPercentages = employeeList.stream().collect(Collectors.summingDouble(c -> c.salary));
		 
		DoubleSummaryStatistics studentStats = employeeList.stream()
				.collect(Collectors.summarizingDouble(c -> c.salary));
		
		Map<Boolean, List<Employee>> res3 = employeeList.stream().collect(Collectors.partitioningBy(c -> c.age > 28));
		
		System.out.println(res3);
		
		Map<Object, Double> avgSalEachDept = employeeList.stream()
				.collect(Collectors.groupingBy(c -> c.department, Collectors.averagingDouble(c -> c.salary)));
	
		System.out.println(avgSalEachDept);
		
		var youngest = employeeList.stream().filter(c -> c.department.equals("Product Development"))
		.collect(Collectors.minBy(Comparator.comparing(c -> c.age))).orElse(null);
		
		System.out.println(youngest);
		
		var seniorMostEmployeeWrapper = employeeList.stream()
				.min(Comparator.comparingInt(a -> a.yearOfJoining)).orElse(null);
		
		System.out.println(seniorMostEmployeeWrapper);
	
		var countMaleFemaleEmployeesInSalesMarketing = 
				employeeList.stream().filter(c -> c.department.equalsIgnoreCase("Sales And Marketing"))
				.collect(Collectors.groupingBy(e -> e.gender, Collectors.counting()));
		
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
		
	}
	
	public static void MultipleStreamFromStream(List<Employee> employeeList) {
		
		var result = employeeList.stream()
				.collect(Collectors
						.groupingBy(c -> c.name.substring(0,1), Collectors.toList())).values();
		
		System.out.println(result);
	}
	
	void m( String s) {}
	public static void main(String[] args) {
		
		   System.out.println(args.length);  
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		//		MultipleStreamFromStream(employeeList);

		
	}
}
