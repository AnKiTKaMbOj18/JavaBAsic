package Interface;

public class App {
	public static void main(String[] args) {
		Machine machine = new Machine();
		machine.start();
//		machine.showInfo();

		Person person = new Person("Merk");
		person.greet();
//		person.showInfo();

		Info info = new Machine();
		info.showInfo();
		
		Info info1 = new Person("kent");
		info1.showInfo();
	}
}
