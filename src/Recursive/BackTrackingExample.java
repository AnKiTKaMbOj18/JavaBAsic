package Recursive;

import java.util.Arrays;

//

public class BackTrackingExample {

	private int[] A = new int[8];

	public void Binary(int n) {
		if (n < 1) {
			System.out.println(Arrays.toString(A));
		} else {
			A[n - 1] = 0;
			Binary(n - 1);
//			A[n - 1] = 1;
//			System.out.println(Arrays.toString(A));
//			Binary(n - 1);
		}
	}

	@Override
	public String toString() {
		return "BackTrackingExample [A=" + Arrays.toString(A) + "]";
	}

	public static void main(String[] args) {
		BackTrackingExample bt = new BackTrackingExample();
		bt.Binary(8);
	}
}
