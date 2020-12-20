package Collections.Maps;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * TreeMap - Java TreeMap class is a red-black tree based implementation.
	It provides an efficient means of storing key-value pairs in sorted order.

	The important points about Java TreeMap class are:
	
	Java TreeMap contains values based on the key.
	It implements the NavigableMap interface and extends AbstractMap class.
	Java TreeMap contains only unique elements.
	Java TreeMap cannot have a null key but can have multiple null values.
	Java TreeMap is non synchronized.
	Java TreeMap maintains ascending order. 
 */

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		SortedMap<Integer, String> smap = new TreeMap<Integer, String>();
		smap.put(100, "Amit");
		smap.put(102, "Ravi");
		smap.put(101, "Vijay");
		smap.put(103, "Rahul");
		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + smap.headMap(102));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + smap.tailMap(102));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + smap.subMap(100, 102));
	}
}
