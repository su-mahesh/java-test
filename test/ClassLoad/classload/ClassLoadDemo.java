package classload;

class StaticClass {
	static {
		System.out.println("new");
	}
}

public class ClassLoadDemo {

	public static void main(String[] args) {
		StaticClass s = new StaticClass();
	}
}
