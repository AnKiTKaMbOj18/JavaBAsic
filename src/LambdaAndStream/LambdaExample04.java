package LambdaAndStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Product {
	private int id;
	private String name;
	private float price;

	Product(int id, String name, float price) {
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
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

}

public class LambdaExample04 {
	public static void main(String[] args) {
		List<Products> list = new ArrayList<>();

		// Adding Products
		list.add(new Products(1, "HP Laptop", 25000f));
		list.add(new Products(3, "Keyboard", 300f));
		list.add(new Products(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name using lambda");

		Collections.sort(list, (n1, n2) -> n1.getName().compareTo(n2.getName()));

		list.forEach(product -> System.out.println(product.getName() + " : " + product.getPrice()));
		System.out.println();
		/*
		 * without lambdas Collections.sort(list, Collections.sort(list, new
		 * Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { // TODO Auto-generated
		 * method stub return p1.getName().compareTo(p2.getName()); }
		 * 
		 * });
		 */

		// using lambdas to filter data
		System.out.println("using lambdas to filter data from list");
		List<Products> list2 = new ArrayList<>();

		list2.add(new Products(1, "Samsung A5", 17000f));
		list2.add(new Products(3, "Iphone 6S", 65000f));
		list2.add(new Products(2, "Sony Xperia", 25000f));
		list2.add(new Products(4, "Nokia Lumia", 15000f));
		list2.add(new Products(5, "Redmi4 ", 26000f));
		list2.add(new Products(6, "Lenevo Vibe", 19000f));

		Stream<Products> filteredData = list2.stream().filter(p -> p.getPrice() > 20000);
		// using lambda to iterate through collection
		filteredData
				.forEach(product_data -> System.out.println(product_data.getName() + " : " + product_data.getPrice()));
	}
}
