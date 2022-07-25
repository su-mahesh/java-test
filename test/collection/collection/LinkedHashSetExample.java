package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		   LinkedHashSet<String> set=new LinkedHashSet(); 
		   set.add("Five");
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
          
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  

	}

}
