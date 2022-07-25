package collection;

//Java program to demonstrate the working
//of a Deque in Java

import java.util.*;

public class DequeExample {
	public static void DequeLinkedList()
	{
		Deque<Integer> deque
		= new LinkedList<Integer>();

	// We can add elements to the queue
	// in various ways

	// Add at the last
	deque.add(1);

	// Add at the first
	deque.addFirst(2);

	// Add at the last
	deque.addLast(3);

	// Add at the first
	deque.push(null);

	// Add at the last
	deque.offer(5);

	// Add at the first
	deque.offerFirst(6);

	System.out.println("queue - "+deque + "\n");

	// We can remove the first element
	// or the last element.
	deque.removeFirst();
	deque.removeLast();
	System.out.println("Deque after removing "
					+ "first and last: "
					+ deque);
	}
	
	public static void main(String[] args)
	{
		DequeLinkedList();
	}
}
