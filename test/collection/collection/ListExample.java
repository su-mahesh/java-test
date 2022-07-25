package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void IntegerArrayToList()
	{
		Integer[] arr = new Integer[] { 1, 2, 3 };
		
		List<Integer> list = Arrays.asList(arr);
		
		list.add(4);
		System.out.println(list);
		
	}
	public static void main(String args[]) {
		IntegerArrayToList();
	}

}
