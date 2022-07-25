package inheritence;

class Parent {
	void walk() {
		System.out.println("parent walk");
	}
	static void  v() {
	
}
	final void m() {
		
		System.out.println("parent final");
	}

	void run() {
		
		System.out.println("parent run");
		
		walk();
	}
}

class Child extends Parent {
	@Override
	void walk() {

		System.out.println("child walk");
		super.walk();
	}

	@Override
	void run() {

		System.out.println("child run");
		super.run();
	}
}

public class InheritenceMethodOverride {

	public static void main(String[] args) {
		Parent p = new Child();
		p.run();
	}

}
