package singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class Singleton {
	private static Singleton singleton;

	static {
		try {
			singleton = new Singleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Singleton() throws Exception {
		if (singleton != null) {
			
		}
		
		String callerClassName1 = Thread.currentThread().getStackTrace()[2].getClassName();
		System.out.println(callerClassName1);
		
		String callerClassName = new Exception().getStackTrace()[1].getClassName();
	//	System.out.println(callerClassName);
		if(callerClassName1 != Singleton.class.getName() )
			throw new InstantiationError("instance already exist");
	//	System.setSecurityManager(new SecurityManager());
	}

	static public Singleton getInstance() throws Exception {

		/*
		 * if (singleton == null) { singleton = new Singleton(); }
		 */
		return singleton;
	}
}

public class SingletonReflection {

	public static void main(String[] args) throws Exception {

		System.out.println(Singleton.getInstance().hashCode());
		Singleton s;
		Singleton s1;
		try {

			Field[] fields = Singleton.class.getDeclaredFields();

			Field f = fields[0];
			f.setAccessible(true);
			f.set(f, null);
			//f.set(null, null);

			Constructor[] Constructors = Singleton.class.getDeclaredConstructors();

			Constructor c = Constructors[0];
			c.setAccessible(true);
			s = (Singleton) c.newInstance();
			System.out.println(s.hashCode());

			s1 = (Singleton) c.newInstance();

			System.out.println(s1.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
