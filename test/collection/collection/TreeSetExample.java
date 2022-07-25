package collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

class TreeSetExample{  
	 public static void main(String args[]){  
	  //Creating and adding elements  
	  TreeSet<Integer> set = new TreeSet<Integer>(); 
	  set.add(150);
	  set.add(24);  
      set.add(66);  
      set.add(12);  
      set.add(15);
     
      
      for(Integer i : set) 
      {
    	  System.out.print(i+" ");
      }
    //  System.out.println(set.comparator());
      System.out.println("Ceiling Value: "+set.floor(13)); 
      
   //   System.out.println("Highest Value: "+set.pollFirst());  
    //  System.out.println("Lowest Value: "+set.pollLast());  
	  //Traversing elements 
      
		/*
		 * System.out.println(); Iterator<Integer> itr = set.iterator();
		 * while(itr.hasNext()){ System.out.println(itr.next()); }
		 */
	  NavigableSet<Integer>  st = set.descendingSet();
	  
	  for(var i: st)
	  {
		  System.out.println(i);
	  }
	 }  
	}  