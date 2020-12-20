package Inheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine = new Machine("Machine");
		machine.start();
		machine.stop();
		
		Car car = new Car("car1");
		car.wipeWindShield();
		car.start();
	}
}
