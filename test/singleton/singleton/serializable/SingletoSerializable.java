package singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}
	
	protected Object readResolve() {
		return singleton;
	}
}
public class SingletoSerializable {

	public static void main(String[] args) {
		try {
			Singleton instance1 = Singleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E://desktop/file.text"));
			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("E://desktop/file.text"));

			Singleton instance2 = (Singleton) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
