package wissen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FindThePairsInArray {

	static Map<Integer, Integer> FindThePairsInArrayDiffK(int[] A, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Properties p = new Properties();

		// Multimap<Integer, Integer> d = new HashMap<Integer, Integer>();
		int length = A.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if ( A[i] - A[j] == k || A[j] - A[i] == k) {

					map.put(A[i], A[j]);
				} /*
					 * else if (A[i] < A[j] && A[j] - A[i] == k) { map.put(A[i], A[j]); }
					 */
			}
		}
		return map;
	}
	static void method(String a){
		System.out.println("S");
	}
	static void method(List a){
		System.out.println("O");
	}
	
	

	public static void main(String[] args) {
		
		int[] A = { 1, 2, 3, -4, 5, -2, 8, 10, 8, 10};
		int k = 2;

		var result = FindThePairsInArrayDiffK(A, k);
		System.out.println(result);
	}

}
