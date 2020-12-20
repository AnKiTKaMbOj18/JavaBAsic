package LambdaAndStream;

public class LambdaExample03 {

	public static void main(String[] args) {

		// Thread Example without lambda
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 is running");
			}
		});

		th.start();

		// Thread Example using lambda

		Runnable rn = () -> System.out.println("Thread 2 is running");

		Thread th2 = new Thread(rn);
		th2.start();
	}

}
