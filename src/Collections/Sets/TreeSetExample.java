package Collections.Sets;

import java.util.Iterator;
import java.util.TreeSet;

/* Java TreeSet class implements the Set interface that uses a tree for storage.
	It inherits AbstractSet class and implements the NavigableSet interface.
	The objects of the TreeSet class are stored in ascending order.

	The important points about Java TreeSet class are:
	
	Java TreeSet class contains unique elements only like HashSet.
	Java TreeSet class access and retrieval times are quiet fast.
	Java TreeSet class doesn't allow null element.
	Java TreeSet class is non synchronized.
	Java TreeSet class maintains ascending order.*/

public class TreeSetExample {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(null); // can't have null values throws null pointer exception
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
