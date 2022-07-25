package CollectionExample;

import java.util.Iterator;
import java.util.PriorityQueue;

class PriorityQueueExample {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");

		System.out.println("head:" + queue.peek());
	//	System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		//while (itr.hasNext()) {
		//	System.out.println(itr.next());
	//	}
		
		
		System.out.println(queue.poll());
//		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
	//	while (itr2.hasNext()) {
	//		System.out.println(itr2.next());
	//	}
	//	queue.add("Amit");
		itr2 = queue.iterator();
		
		System.out.println("head - "+queue.peek());
		
	//	System.out.println("after removing two elements:");
		//  while (itr2.hasNext()) {
			  //System.out.println(itr2.next());
		//  }
		 
	}
}
