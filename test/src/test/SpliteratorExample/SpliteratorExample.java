package test.SpliteratorExample;

import java.util.*;

public class SpliteratorExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		// Getting Spliterator
		Spliterator<String> spliterator1 = list.spliterator();


		/*
		 * while (namesSpliterator.tryAdvance(a -> System.out.println(a))) {
		 * //System.out.println(0); }
		 */
		System.out.println();
		
		
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		 
		System.out.println(spliterator1.estimateSize());
		System.out.println(spliterator2.getExactSizeIfKnown());
		///spliterator1.forEachRemaining(System.out::println);
		 
		System.out.println("========");
		 
		//spliterator2.forEachRemaining(System.out::println);
		 
	}
}
