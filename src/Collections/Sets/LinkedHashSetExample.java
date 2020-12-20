package Collections.Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet - Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface.
	It inherits HashSet class and implements Set interface.

	The important points about Java LinkedHashSet class are:
	
	Java LinkedHashSet class contains unique elements only like HashSet.
	Java LinkedHashSet class provides all optional set operation and permits null elements.
	Java LinkedHashSet class is non synchronized.
	Java LinkedHashSet class maintains insertion order.
	
	
 */

public class LinkedHashSetExample {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		LinkedHashSet<String> set = new LinkedHashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add(null); // it allows null values
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
