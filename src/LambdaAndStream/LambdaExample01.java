package LambdaAndStream;

public class LambdaExample01 {

	public interface Drawable {
		public void draw();
	}

	interface Sayable {
		public String say();
	}

	interface SingleSayable {
		public String say(String name);
	}

	public static void main(String[] args) {
		// implementing an interface without lambda
		Drawable drawable = new Drawable() {
			@Override
			public void draw() {
				System.out.println("drawing without lambda");
			}
		};

		drawable.draw();

		// using lambda expression

		Drawable drawable2 = () -> System.out.println("drawing using lambda");
		drawable2.draw();

		// No parameter lambda
		Sayable sayable = () -> "I am single line lambda function";
		System.out.println(sayable.say());

		// Single parameter lambda
		SingleSayable singleSayable = name -> "Hello, " + name;
		String name = singleSayable.say("ankit");
		System.out.println(name);
	}
}
