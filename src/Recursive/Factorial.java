package Recursive;

public class Factorial {

	public static int findFactorial(int number) {
		if (number == 1) {

			return 1;
		}

		return findFactorial(number - 1) * number;
	}

	public static void main(String[] args) {
		int number = 8;
		System.out.println(findFactorial(number));
	}
}
