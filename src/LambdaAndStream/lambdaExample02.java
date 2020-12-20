package LambdaAndStream;

import java.util.ArrayList;
import java.util.List;

public class lambdaExample02 {

	public interface Adder {
		int add(int a, int b);
	}

	public static void main(String[] args) {

		// lambda using multiple param's
		Adder adder = (int x, int y) -> x + y;
		int res = adder.add(10, 20);

		System.out.println(res);

		// for each loop with lambda
		List<String> list = new ArrayList<>();
		list.add("ankit");
		list.add("kamboj");
		list.add("mark");
		list.add("sam");
		list.add("peter");
		list.add("cyano");

		// Iterating using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		// using enhanced for loop or for in loop or for each you can say
		for (String person : list) {
			System.out.println(person);
		}

		System.out.println();

		// using lambdas new for each loop
		list.forEach(l -> System.out.println(l));
	}
}
