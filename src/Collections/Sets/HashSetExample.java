package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HASHSET - Java HASHSET class is used to create a collection that uses a hash table for storage. 
   It inherits the AbstractSet class and implements Set interface.

	HashSet stores the elements by using a mechanism called hashing.
	HashSet contains unique elements only.
	HashSet allows null value.
	HashSet class is non synchronized.
	HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
	HashSet is the best approach for search operations.
	The initial default capacity of HashSet is 16, and the load factor is 0.75.
	
	A list can contain duplicate elements whereas Set contains unique elements only.

 */

public class HashSetExample {
	public static void main(String args[]) {

		// Creating HashSet and adding elements
		HashSet<String> hset = new HashSet();
		hset.add("One");
		hset.add("Two");
		hset.add("Three");
		hset.add("Four");
		hset.add("Five");
		Iterator<String> i = hset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("An initial list of elements: " + set);

		// Removing specific element from HashSet
		set.remove("Ravi");
		System.out.println("After invoking remove(object) method: " + set);

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated List: " + set);

		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);

		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + set);

		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);
	}
}
