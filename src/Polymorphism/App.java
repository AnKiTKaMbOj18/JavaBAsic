package Polymorphism;

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();
		plant.grow();

		Tree tree = new Tree();
		tree.grow();
		tree.shedLeaves();

		Plant plant2 = tree; // this is polymorphism in action
		plant2.grow();

	}
}
