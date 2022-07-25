package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface 
interface Drawable {
	public void draw();
}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
}

public class LambdaExample {

	void removeDuplicatesFromList() {

	}

	static void staticMethod() {
		System.out.println("staticMethod ");
	}

	public static void main(String[] args) {

		// with lambda
		Drawable d2 = () -> {
			staticMethod();
			System.out.println("Drawing ");
		};
		// d2.draw();
		// System.out.println("anonymous class name : " + d2.getClass().getName());
//		System.out.println(LambdaExample.class.getName());

		List<Product> list = new ArrayList<Product>();
		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}

	}

}
