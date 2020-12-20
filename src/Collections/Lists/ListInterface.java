package Collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collections in Java
	The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
	Java Collections can achieve all the operations that you perform on a data such as 
	searching, sorting, insertion, manipulation, and deletion.

 * Java Collection means a single unit of objects. Java Collection framework provides many interfaces
 	(Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

 * What is Collection framework
	The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
	1.Interfaces and its implementations, i.e., classes
	2.Algorithm
 
 * LIST - extends collections framework & stores elements in an indexed appraoch and we can add duplicate elements.
 	Three types - ArrayList , LinkedList , Vector 
 	
 	To instantiate the List interface, we must use :
	List <data-type> list1= new ArrayList();  
	List <data-type> list2 = new LinkedList();  
	List <data-type> list3 = new Vector();  
	List <data-type> list4 = new Stack();  
 */

public class ListInterface {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
