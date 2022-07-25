package java8.Stream;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

class Product {

	int id;
	String name;
	String type;
	float price;

	public Product(int id, String name, String type, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public int getId() {
	return id;
}

	public String toString() {
		return "{ " + this.id + ", " + this.name + ", " + this.type + ", " + this.price + " }";
	}
}

public class RemoveDuplicatesCustom {
//using map putIfAbsent
	static void removeDuplicatesByCombinedDataMember(List<Product> list) {

		list = list.stream().filter(

				distinctByKey(p -> {
					return p.id + " " + p.name;
				})

		).collect(Collectors.toList());
		System.out.println(list);
	}


	static void removeDuplicatesByConvertToTreeSet(List<Product> list) {

		var uniqueSet = list.stream()
				.collect(Collectors.toCollection(() -> 
				new TreeSet<>((a,b) -> ((Integer)a.id).compareTo(b.id))));
		
		System.out.println(uniqueSet);

	}

	public static <T, R> Predicate<T> distinctByKey(Function<T, R> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();

		return t ->  map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		list.add(new Product(1, "Acer", "Laptop", 1000));
		list.add(new Product(2, "Hp", "Desktop", 2000));
		list.add(new Product(2, "Samsung", "Mobile", 2000));
		list.add(new Product(2, "Samsung", "Mobile", 2000));
		list.add(new Product(1, "Acer", "Laptop", 1000));
		// removeDuplicatesByCombinedDataMember(list);

		removeDuplicatesByConvertToTreeSet(list);

	}

}
