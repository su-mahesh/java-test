package wissen;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountUniqueDigits {
	public static Set findDuplicateInStream(Integer[] A) {
		return Stream.of(A)
				
				// Group the elements along
				// with their frequency in a map
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

				// Convert this map into a stream
				.entrySet().stream()

				// Check if frequency > 1
				// for duplicate elements
				.filter(m -> m.getValue() > 1)

				// Find such elements
				.map(Map.Entry::getKey)

				// And Collect them in a Set
				.collect(Collectors.toSet());
	}

	static Integer[] count(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		Integer[] d = Arrays.stream(a).boxed().filter(c -> !set.add(c)).toArray(c -> new Integer[c]);
		return d;
	}

	public static void main(String[] args) {

		/*
		 * int[] a = { 6, 3, 6, 8, 6, 13, 5 }; Integer[] b = count(a); for (Integer i :
		 * b) { System.out.print(i + " "); }
		 */
		int[] a = { 6, 3, 6, 8, 6, 13, 5, 8 };
		Integer[] K = { 6, 3, 6, 8, 6, 13, 5, 5 };
	///	var r = findDuplicateInStream(K);
//		System.out.println(r);
		
		List<Integer> t = Arrays.stream(a).boxed()
                .collect(Collectors.toList());
		 var se = t.stream().filter(i-> Collections
				 .frequency(t, i)>1)				 
			.collect(Collectors.toSet());
		 
		 System.out.println(se);
		var r1 = 
				//Stream.of(K)
				Arrays.stream(a).boxed()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(c -> c.getValue() > 1).map(c -> c.getKey())
		.toArray(c -> new Integer[c]);
		
		
		for (Integer i : r1) { System.out.print(i + " "); }
	//	System.out.println(r1);

	}

}
