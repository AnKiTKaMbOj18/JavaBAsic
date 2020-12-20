package Basics;

class Frog {
	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Frog [id=" + id + ", name=" + name + "]";
	}

}

public class StringAndObject {

	public static void main(String[] args) {
		Frog frog = new Frog(7, "frog1");
		System.out.println(frog);
	}
}
