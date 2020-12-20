package Interface;

public class Machine implements Info {
	private int id = 7;

	public void start() {
		System.out.println("Machine Started: " + id);
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine: " + id);
	}
}
