package LambdaAndStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample09 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// This is more compact approach for filtering data
		float totalPrice = productsList.stream().map(data -> data.getPrice()).reduce(0.0f, (sum, price) -> sum + price); // accumulating
																															// price
		System.out.println("Total price with stream reduce more compact approach:- ");
		System.out.println(totalPrice + "\n");

		// More precise code
		// accumulating price, by referring method of Float class
		System.out
				.println("Total price with stream reduce using Float::sum (method reference) more precise approach:- ");
		float totalPrice2 = productsList.stream().map(data -> data.getPrice()).reduce(0.0f, Float::sum);
		System.out.println(totalPrice2 + "\n");

		// To get maximum price of the product
		System.out.println("Max price of the product from list using streams: ");
		Product productX = productsList.stream().max((x, y) -> x.getPrice() > y.getPrice() ? 1 : -1).get();
		System.out.println(productX.getPrice() + "\n");

		// To get minimum price of the product
		System.out.println("Min price of the product from list using streams: ");
		Product productY = productsList.stream().min((x, y) -> x.getPrice() > y.getPrice() ? 1 : -1).get();
		System.out.println(productY.getPrice() + "\n");

		// To get count of products using streams with filter
		System.out.println("Count of products after filtering with stream");
		long count = productsList.stream().filter(p -> p.getPrice() < 30000).count();
		System.out.println(count + "\n");

		// Converting product List into Set
		// filter product on the base of price
		System.out.println("Converting List into Set and also using method reference: ");

		Set<Float> priceSet = productsList.stream().filter(p -> p.getPrice() < 30000).map(Product::getPrice)
				.collect(Collectors.toSet()); // collect it as Set(removes duplicate elements)
		System.out.println(priceSet);
	}
}
