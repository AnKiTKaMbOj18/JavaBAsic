package Inheritance;

public class Machine {

	private String machineName;

	public Machine(String name) {
		this.machineName = name;
	}

	public void start() {
		System.out.println("Machine started: " + machineName);
	}

	public void stop() {
		System.out.println("Machine stopped: " + machineName);
	}
}
