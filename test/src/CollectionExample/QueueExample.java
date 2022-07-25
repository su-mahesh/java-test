package CollectionExample;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void QueueComparedToPriorityQueue() {
		class Book implements Comparable<Book> {
			int id;
			String name, author, publisher;
			int quantity;

			public Book(int id, String name, String author, String publisher, int quantity) {
				this.id = id;
				this.name = name;
				this.author = author;
				this.publisher = publisher;
				this.quantity = quantity;
			}

			public int compareTo(Book b) {
				if (id > b.id) {
					return 1;
				} else if (id < b.id) {
					return -1;
				} else {
					return 0;
				}
			}
		}
		PriorityQueue<Book> queue = new PriorityQueue<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to the queue
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);

		System.out.println("Traversing the queue elements:");
		// Traversing queue elements
		for (Book b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		  queue.remove();  
		    System.out.println("After removing one book record:");  
		    for(Book b:queue){  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		        }  
	}

	public static void LinkkedListQueue() {
		Queue<Integer> q = new LinkedList<>();

		q.add(3);
		q.add(4);
		q.add(1);
		q.add(2);
		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 5; i > 0; i--)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue " + q);

		// To remove the head of queue.
		/*
		 * int removedele = q.remove(); System.out.println("removed element-" +
		 * removedele);
		 */
		while (q.peek() != null) {
			System.out.print(q.remove() + " ");
		}
		System.out.println();
	}

	public static void PriorityQueue() {
		Queue<Integer> q = new PriorityQueue<>();

		// q.add(3); q.add(4); q.add(1); q.add(2);

		for (int i = 5; i > 0; i--)
			q.add(i);

		System.out.println("head " + q.peek());
		System.out.println("Elements of queue " + q);
		var it = q.iterator();

		while (q.peek() != null) {
			System.out.print(q.remove() + " ");
		}

	}

	public static void main(String[] args) {
		// LinkkedListQueue();
		// PriorityQueue();
		QueueComparedToPriorityQueue();
	}
}
