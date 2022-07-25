package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	static int[] Fibonacci(int n) {
		List<Integer> lst = new ArrayList();

		lst.add(0);
		lst.add(1);

		int first = 0;
		int second = 1;
		int sum = 0;// = first + second;
		for (int i = 3; i <= n; i++) {

			sum = first + second;
			lst.add(sum);
			first = second;
			second = sum;
		}
		//System.out.println(lst);
		return lst.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		var s = Fibonacci(10);
		for (int i : s) {
			System.out.print(i+" ");
		}
		
	}

}
