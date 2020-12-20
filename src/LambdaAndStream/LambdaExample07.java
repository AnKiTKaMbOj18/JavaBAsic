package LambdaAndStream;

interface Messagable {
	LambdaExample07 getMessage(String msg);
}

public class LambdaExample07 {

	public LambdaExample07(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// You can refer a constructor by using the new keyword. Here, we are referring
		// constructor with the help of functional interface.
		Messagable messagable = LambdaExample07::new;
		messagable.getMessage("Hello from constructor using method reference");
		
	}
}
