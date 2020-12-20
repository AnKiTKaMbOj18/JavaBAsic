package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

/*
 * SET - 
	 Set Interface in Java is present in java.util package.
	 It extends the Collection interface. 
	 It represents the unordered set of elements which doesn't allow us to store the duplicate items.
	 We can store at most one null value in Set.
	 Set is implemented by HashSet, LinkedHashSet, and TreeSet.

	Set can be instantiated as:
	
	Set<data-type> s1 = new HashSet<data-type>();  
	Set<data-type> s2 = new LinkedHashSet<data-type>();  
	Set<data-type> s3 = new TreeSet<data-type>();  
 */

public class SetInterface {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
