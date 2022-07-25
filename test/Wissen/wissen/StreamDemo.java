package wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MyClass {
	int i = 40;
	String s = "A";

	MyClass() {
	}
}

public class StreamDemo {

	public static Long sumOfSquareAllOddnumbers(List<Integer> lst) {

		var result = lst.stream().filter(c -> c % 2 != 0).mapToLong(c -> c * c).sum();
		var result1 = lst.stream().filter(c -> c % 2 != 0).map(c -> c * c)
				.collect(Collectors.summingLong(c -> c));

		return result1;
	}

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(1, 3));
		Long result = sumOfSquareAllOddnumbers(lst);
		System.out.println(result);

		// List<MyClass> lst1 = new ArrayList<MyClass>(Arrays.asList(new MyClass(), new
		// MyClass(), new MyClass()));
		// var se = lst1.stream().reduce(0, (a, b) -> a + b.i, Integer::sum);
		// System.out.println(se);
	}
}
