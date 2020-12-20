package Inheritance;

public class Car extends Machine{
	
	String carName;
	
	public Car(String carName){
		super(carName);
		this.carName = carName;
	}
	public void wipeWindShield() {
		System.out.println("Wiping wind shield");
	}
}
