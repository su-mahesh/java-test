package java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class A {

	 
}

public class FindSecondLast {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		list.add(new Product(1, "Acer", "Laptop", 7000));
		list.add(new Product(2, "Hp", "Desktop", 2000));
		list.add(new Product(2, "Samsung", "Mobile", 6000));
		list.add(new Product(2, "Samsung", "Mobile", 3000));
		list.add(new Product(1, "Acer", "Laptop", 2000));

		
		/*
		 * var sorted = list.stream().sorted((a, b) -> { var s = ((Float)
		 * a.price).compareTo(b.price); System.out.println(a.price + " " + b.price + " "
		 * + s); return s; }).toList();
		 */

		//Find second last
		var secondLast = list.stream().sorted((a, b) -> ((Float) b.price).compareTo(a.price)).skip(1).findFirst()
				.orElse(null);
//		System.out.println(secondLast);

		var s = list.stream().flatMap(c -> {
			
			return Stream.of(c.name);
		}).toList();

		String[][] str = new String[][] {{"a","b"}, {"c", "d"},{"f"}};
		Stream.of(str).findAny();
		var st = Stream.of(str).map(c -> c).peek(c -> System.out.println(c)).collect(Collectors.toList());
		var st1 = Stream.of(str).flatMap(Stream::of).peek(c -> System.out.println(c)).collect(Collectors.toList());
		
		float re = list.stream().parallel().reduce(1, (a,b) -> { return a + b.name.length();}, 
				(a , b) -> a + b);
		
		System.out.println("re : "+re);
	//	System.out.println(st);
//		System.out.println(st1);
		
		
	}
}
