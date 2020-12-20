package Collections.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LinkedHashMap - Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface,
 	with predictable iteration order.
 	It inherits HashMap class and implements the Map interface.
 	
 	Java LinkedHashMap contains values based on the key.
	Java LinkedHashMap contains unique elements.
	Java LinkedHashMap may have one null key and multiple null values.
	Java LinkedHashMap is non synchronized.
	Java LinkedHashMap maintains insertion order.
	The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 
 */

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedHashMapExample {
	public static void main(String[] args) {

		Map<Integer, Book> map = new LinkedHashMap<>();

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		// Adding Books to map
		map.put(2, b2);
		map.put(1, b1);
		map.put(3, b3);

		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book book = entry.getValue();

			System.out.println(
					book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
		}

	}
}
