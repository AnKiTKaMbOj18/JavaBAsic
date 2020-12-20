package Collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map -  A map contains values on the basis of key, i.e. key and value pair.
 	Each key and value pair is known as an entry. A Map contains unique keys.
	A Map is useful if you have to search, update or delete elements on the basis of a key.
	
	There are two interfaces for implementing Map in java: Map and SortedMap
	And three classes: HashMap, LinkedHashMap, and TreeMap
	TreeMap implements SortedMap i.e its implementation of SortedMap
	
	A Map doesn't allow duplicate keys, but you can have duplicate values.
	HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
	
	HashMap	- HashMap is the implementation of Map, but it doesn't maintain any order.
	LinkedHashMap -	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
	TreeMap	- TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
	
	Map.Entry Interface
	Entry is the sub interface of Map. So we will be accessed it by Map.Entry name.
	It returns a collection-view of the map, whose elements are of this class.
	It provides methods to get key and value.
 */

public class MapInterface {

	// Non-Generic style (older way)
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map
		Set set = map.entrySet(); // Converting to set so that we can traverse

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.print(" " + entry.getKey() + " " + entry.getValue());
		}
		System.out.println();
		System.out.println("Using generics");
		// Generic (New way)
		Map<Integer, String> hMap = new HashMap<>();

		hMap.put(1, "mike");
		hMap.put(2, "kim");
		hMap.put(3, "lomby");
		hMap.put(4, "wester");
		hMap.put(5, "olley");

		// Elements can traverse in any order
		for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
			System.out.print(" " + entry.getKey() + " " + entry.getValue());
		}
		System.out.println("\n");
		
		// Returns a Set view of the mappings contained in this map
		// Returns a sequential Stream with this collection as its source
		// Sorted according to the provided Comparator
		// Performs an action for each element of this stream
		hMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}
