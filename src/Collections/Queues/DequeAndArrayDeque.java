package Collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Deque - Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side.
 	Deque stands for a double-ended queue which enables us to perform the operations at both the ends. 
 	Deque d = new ArrayDeque();  
 	
 	ArrayDeque class implements the Deque interface. It facilitates us to use the Deque.
 	Unlike queue, we can add or delete the elements from both the ends.
	ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
	
	Unlike Queue, we can add or remove elements from both sides.
	Null elements are not allowed in the ArrayDeque.
	ArrayDeque is not thread safe, in the absence of external synchronization.
	ArrayDeque has no capacity restrictions.
	ArrayDeque is faster than LinkedList and Stack.
 	
 */

class ComputerBooks {
	int id;
	String name, author, publisher;
	int quantity;

	public ComputerBooks(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class DequeAndArrayDeque {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("arvind"); // offer is similar to add but exception safe
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai"); // adds element at first position
		System.out.println("After offerFirst Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}
		// deque.poll();
		// deque.pollFirst();//it is same as poll() // removes element from start index
		deque.pollLast(); // removes element from last index
		System.out.println("After pollLast() Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}

		Deque<ComputerBooks> set = new ArrayDeque<ComputerBooks>();
		// Creating Books
		ComputerBooks b1 = new ComputerBooks(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		ComputerBooks b2 = new ComputerBooks(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		ComputerBooks b3 = new ComputerBooks(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to Deque
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing ArrayDeque
		for (ComputerBooks b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}
}
