package Collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *	ArrayList - we can add or remove elements dynamically 
	The size of the list in increased dynamically if the elements are added more than the initial size.
	
	ArrayList<T> arrayList =  new ArrayList<>();
	
	Points - 
	ArrayList internally uses a dynamic array to store the elements.
	Adding or removing element from backward direction is fast
	Adding or removing elements from front is slow
	Traversing an ArrayList from back is fast
	Traversing an ArrayList from front or from random position is slow.
	Finding an element using index is fast
	ArrayList maintains insertion order
	ArrayList can have duplicate entries
	Its better for storing and accessing data
	
 */

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

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
