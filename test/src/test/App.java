package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
	void method() {
		Integer i = 0;
		{
			Integer a = 0;
			//block 1
		}
	}
	static int reverseMatchInArray(Integer[] arr)
    {
		int count = 0;
		List<Integer> lst = Arrays.asList(arr);
		for (Integer i : lst) {
			var index = lst.indexOf(i);
			var numStrt = String.valueOf(i);
			int digitsLength = numStrt.length();
			
			if(digitsLength == 2)
			{
				lst.set((Integer)index, 0);
				var reverseNum = Integer.parseInt(new StringBuilder(numStrt).reverse().toString());
				if(lst.contains(reverseNum))
		    	{
				//	System.out.println(i+" "+reverseNum);
					i = 0;
					count++;
		    	}
			}
		      
			}
		return count;
		} 
static Integer i =0;





	public static void main(String[] args) throws ClassNotFoundException {
		Integer[] arr = new Integer[] {21,43,54,23,67,90,84,34,45,55,76,26,48};
		var count = reverseMatchInArray(arr);
		System.out.println(count);
		
		Class s = Class.forName("java.lang.String");
		
		System.out.println(s);
		
	}

}
