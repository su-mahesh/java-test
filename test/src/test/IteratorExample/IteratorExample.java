package test.IteratorExample;

import java.util.*;

class A {
	int i = 0;
}

public class IteratorExample {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("Welcome");
		list.add("to");
		list.add("GFG");

		// System.out.println("The list is given as : " + list);
		// get the iterator on the list
		Iterator<String> itr = list.iterator();
		itr.next();
		itr.remove();
		while (itr.hasNext()) {
			
			var str = (String) itr.next();
			System.out.println(str);
			if (str.equals("to")) {
				itr.remove();
				System.out.println(" to removed");
				
			}
		}
		//itr.remove();
	//	itr.forEachRemaining(c -> System.out.println(c));
		//System.out.println(list);
	}

}
