package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

enum SingletonEnum {
	INSTANCE;

	static int s;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

class SuperClass implements Cloneable {
	int i = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

//Eager initialization
class Singleton implements Serializable {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}

	// implement readResolve method
	// readObject() is an existing method in ObjectInputStream class.
	// While reading object at the time of deserialization readObject() method
	// internally check whether the class object which is being deserialized having
	// readResolve() method or not. If readResolve() method exists then it will
	// invoke it and return the same instance.
	protected Object readResolve() {
		return singleton;
	}
}

//Eager initialization access directly
class Singleton1 extends SuperClass {
	public static Singleton1 singleton = new Singleton1();

	private Singleton1() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException();
		return singleton;
	}
}

//Eager initialization using static block access instance directly
class Singleton2 {
	public static Singleton2 singleton;

	private Singleton2() {
	}

	static {
		singleton = new Singleton2();
	}
}

//Lazy initialization
class Singleton3 {
	public static Singleton3 singleton;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (singleton == null)
			singleton = new Singleton3();

		return singleton;
	}
}

//Lazy initialization thread safe synchronized method
class Singleton4 {
	public static Singleton4 singleton;

	private Singleton4() {
	}

	synchronized public static Singleton4 getInstance() {
		if (singleton == null)
			singleton = new Singleton4();

		return singleton;
	}
}

//Lazy initialization thread safe synchronized block double checking
// acquire lock only if instance is null 
class Singleton5 {
	public static Singleton5 singleton;

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		if (singleton == null) {
			synchronized (Singleton5.class) {
				if (singleton == null)
					singleton = new Singleton5();
			}
		}

		return singleton;
	}
}

class Singleton6 {

	private Singleton6() {
		// private constructor
	}

	// Inner class to provide instance of class
	private static class InnerSingleton {
		private static final Singleton6 INSTANCE = new Singleton6();
	}

	public static Singleton6 getInstance() {
		return InnerSingleton.INSTANCE;
	}
}

enum EnumSingleton {

	INSTANCE("Initial class info");

	private String info;

	private EnumSingleton(String info) {
		this.info = info;
	}

	public EnumSingleton getInstance() {
		return INSTANCE;
	}

	// getters and setters
}

public class SingletonDemo {

	public static void main(String[] args) {

		
		Singleton s = Singleton.getInstance();
		Singleton s1 = null;

		try {
			Constructor<Singleton>[] constructors = (Constructor<Singleton>[]) Singleton.class
					.getDeclaredConstructors();

			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				s1 = (Singleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(s == s1);

		try {
			Singleton instance1 = Singleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			// deserialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			Singleton instance2 = (Singleton) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		// cloning

		try {
			Singleton1 instance1 = Singleton1.singleton;
			Singleton1 instance2 = (Singleton1) instance1.clone();
			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		SingletonEnum singleton = SingletonEnum.INSTANCE;
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;

		// System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton == singleton1);
		
		Object o = new Object();
		System.out.println(o.toString());
		System.out.println(Integer.toHexString(o.hashCode()));
		
		
		
	}

}
