package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObject {
	public static void main(String[] args) {
		System.out.println("Writing object...");

		Person mike = new Person("mike", 123);
		Person sue = new Person("sue", 567);

		System.out.println(mike);
		System.out.println(sue);

		try (FileOutputStream fs = new FileOutputStream("person.bin")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(mike);
			os.writeObject(sue);

			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
