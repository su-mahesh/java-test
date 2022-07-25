package java8.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class RemoveDuplicatesPrimitive {

	static void removeDuplicates(Integer[] arr) {
		Stream<Integer> stream = Arrays.stream(arr);
		Integer[] newArr = stream.distinct().toArray(c -> new Integer[c]);

		for (Integer integer : newArr) {
			System.out.print(integer + ", ");
		}
	}

	static void removeDuplicates(String[] arr) {
		Stream<String> stream = Arrays.stream(arr);
		String[] newArr = stream.distinct().toArray(c -> new String[c]);

		for (String string : newArr) {
			System.out.print(string + ", ");
		}
	}

	public static void main(String[] args) {
		Integer[] IntegerArr = new Integer[] { 1, 2, 6, 4, 2, 1, 5, 8, 8, 8, 0 };
		
		String[] StringArr = new String[] { "A","B", "C", "c", "D", "E", "F", "F", "B" };
		
		//removeDuplicates(IntegerArr);
		//removeDuplicates(StringArr);
		

	}

}
