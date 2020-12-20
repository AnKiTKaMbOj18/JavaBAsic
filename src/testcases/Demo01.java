package testcases;

import java.util.StringTokenizer;

public class Demo01 {

	public static int findMax(int[] num) {
		// int max = 0; // it should not be zero, it should be max= num[0];
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}

	public static int cube(int number) {
		return number * number * number;
	}

	public static String reverseWord(String str) {
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		while (tokenizer.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();

			result.append(sb);
			result.append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 19, 12, 23, 45, 3, 21 };
		int max = findMax(arr);
		System.out.println("Max number from list1: " + max);

		int[] arr1 = { -19, -12, -23, -45, -3, -21 };
		int max1 = findMax(arr1);
		System.out.println("Max number from list2: " + max1);
	}
}
