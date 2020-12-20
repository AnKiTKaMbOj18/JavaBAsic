package LambdaAndStream;

import java.util.function.BiFunction;

public class LambdaExample06 {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, float b) {
		return (int) (a + b);
	}

	public static float add(float a, float b) {
		return a + b;
	}

	public void printMsg() {
		System.out.println("this is instance method");
	}

	public static void main(String[] args) {
		// Here we will use predefined functional interface for method reference
		// from java library package i.e java.util.function.*

		BiFunction<Integer, Integer, Integer> adder = LambdaExample06::add;
		int result = adder.apply(10, 25);
		System.out.println(result);

		BiFunction<Integer, Float, Integer> add1 = LambdaExample06::add;
		int result1 = add1.apply(50, 50.0f);
		System.out.println(result1);

		BiFunction<Float, Float, Float> add2 = LambdaExample06::add;
		float result2 = add2.apply(150.0f, 20.05f);
		System.out.println(result2);

		// In the following example, we are referring instance (non-static) method.
		// Runnable interface contains only one abstract method. So, we can use it as
		// functional interface.

		Thread th = new Thread(new LambdaExample06()::printMsg);
		th.start();
	}
}
