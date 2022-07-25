package test.InheritanceExample;

abstract class abstractClass {
abstract void fun();
}

abstract class abstractChild extends abstractClass {


}

class Parent1 {
	static int i = 0;
	public int intI = 9;
}

class Child1 extends Parent1 {
	public int intI;

	void increase() {
		i++;
	}
}

class Child2 extends Parent1 {
	void increase() {
		i++;
	}
}

interface Interface {
	public void fun();

}

class InterfaceChild implements Interface {
	public void fun() {
		System.out.println("class child interface method");
	}

	public void childMethod() {
		System.out.println("class child method");
	}
}

class Parent {
	void parentMethod1() {
		System.out.println("parent method1");
	}

	void overrideMethod() {
		System.out.println("parent override method");
	}
}

class Child extends Parent {
	void childMethod1() {
		System.out.println("child method1");
	}

	void overrideMethod() {
		System.out.println("child override method");
	}
}

public class InheritanceCasting {

	public static void main(String[] args) {

		Parent p = new Child(); // Up casting
		// p.childMethod1(); // not possible
		p.parentMethod1();
		p.overrideMethod(); // overridden method is called

		Child c = (Child) p; // Down casting

		c.parentMethod1();

		Interface in = new InterfaceChild(); // Up casting
		in.fun();
		InterfaceChild ch = (InterfaceChild) in; // Down casting

		ch.childMethod();

		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		ch1.i++;
		ch2.i++;

		// ch1.increase();
		// ch2.increase();


	}

}
