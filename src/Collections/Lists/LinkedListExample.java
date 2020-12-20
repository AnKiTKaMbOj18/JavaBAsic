package Collections.Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 *	ArrayList - we can add or remove elements dynamically 
	The size of the list in increased dynamically if the elements are added more than the initial size.
	
	LinkedList<T> LinkedList =  new LinkedList<>();
	
	Points - 
	LinkedList internally uses a doubly linked list to store the elements.
	Adding or removing element from backward direction is slow
	Adding or removing elements from front is fast
	Traversing an LinkedList from back is slow
	Traversing an LinkedList from front or from random position is fast.
	Finding an element using index is fast
	LinkedList maintains insertion order
	LinkedList can have duplicate entries
	Its better for manipulating data
 */

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		// adding elements to list
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println("List of numbers is: " + list);

		// Iterating over list using enhanced for loop
		for (int elemenets : list) {
			System.out.print(elemenets + " ");
		}

		// removing last element from list using its index
		list.remove(list.size() - 1);

		System.out.println();

		// list after removing elements
		System.out.println("List of numbers is: " + list);

		// Iterating over list using Iterator

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int nextElem = itr.next();
			System.out.print(nextElem + " ");
		}
	}
}
