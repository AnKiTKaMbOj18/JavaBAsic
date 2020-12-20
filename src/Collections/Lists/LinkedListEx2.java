package Collections.Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		// adding elements to list
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println("List of numbers is: " + list);
		
		// insert element at begining in the list
		list.add(0, 12);
		System.out.println(list);
		
		//insert element at the end in list
		list.add(11);
		System.out.println(list);
		System.out.println(list.get(0));
	}
}
