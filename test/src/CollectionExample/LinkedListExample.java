package CollectionExample;

import java.util.*;  

public class LinkedListExample {

	public static void main(String[] args) {
		
		 LinkedList<String> ll = new LinkedList<String>();  
		 System.out.println("Initial list of elements: "+ll);  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay"); 
         
         System.out.println("After invoking add(E e) method: "+ll);  
         
         Collection<String> list = new ArrayList<String>();// Creating arraylist
 		list.add("Mango");// Adding object in arraylist
 		list.add("Apple");
 		list.add("Banana");
 		list.add("Grapes");
 		
 		ll.addAll(list);
 		 System.out.println("After invoking addAll(E e) method: "+ll);
	}

}
