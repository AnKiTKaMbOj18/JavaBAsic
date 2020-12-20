package LambdaAndStream;

public class LambdaExample05 {

	interface Sayable {
		void say();
	}

	public static void saySomething() {
		System.out.println("Hello, this is a static method");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = LambdaExample05::saySomething;
		sayable.say();

		/*
		 * Runnable rn = new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub System.out.
		 * println("Thread running with runnable interface using anonymous innerclass");
		 * } };
		 */

		// using method reference in thread, we are using predefined functional
		// interface Runnable to refer static method, above commented code is
		// other/older way of using runnable interface
		Thread thread = new Thread(LambdaExample05::ThreadStatus);
		thread.start();
	}
}
