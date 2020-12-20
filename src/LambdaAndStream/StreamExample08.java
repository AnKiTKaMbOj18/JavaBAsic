package LambdaAndStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java provides a new additional package in Java 8 called java.util.stream.
//This package consists of classes, interfaces and enum to allows functional-style operations on the elements.
//You can use stream by importing java.util.stream package.

class Products {
	private int id;
	private String name;
	private float price;

	Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class StreamExample08 {

	public static void main(String[] args) {
		List<Products> list = new ArrayList<>();

		list.add(new Products(1, "HP Laptop", 25000));
		list.add(new Products(1, "Dell Laptop", 35000));
		list.add(new Products(1, "Apple Laptop", 45000));
		list.add(new Products(1, "Samsung Laptop", 29000));
		list.add(new Products(1, "Asus Laptop", 85000));
		list.add(new Products(1, "Sony Laptop", 55000));
		list.add(new Products(1, "Lenevo Laptop", 28000));

		// old way of filtering collection
		List<Float> priceList = new ArrayList<>();

		for (Products products : list) {
			// filtering data of list
			if (products.getPrice() > 30000) {
				priceList.add(products.getPrice()); // adding price to price list
			}
		}
		System.out.println(priceList); // displaying filtered price list
		System.out.println();

		// using streams to filter
		List<Float> priceList2 = list.stream().filter(p -> p.getPrice() > 30000).map(m -> m.getPrice())
				.collect(Collectors.toList());
		System.out.println(priceList2);

		System.out.println();

		// Stream example for iterating using limit to fix the iteration
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		System.out.println();

		list.stream().filter(p -> p.getPrice() < 30000).forEach(item -> System.out.println(item.getName()));
	}
}
