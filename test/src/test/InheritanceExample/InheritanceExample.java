package test.InheritanceExample;

import java.io.FileNotFoundException;

class A {

	
	public int privateI;

	A() {
		System.out.println("A contructor 0");
	}

	A(String a) {

		System.out.println("A contructor 1");
	}

	 static void staticMethod(){

		System.out.println("Parent Static method");
	}

	static {
//		System.out.println("static block");
	}

	A method() throws FileNotFoundException {
		System.out.println("method from a");
		return new A();
	}

	final void finalmethod() {
		System.out.println("final method");
	}

	void fun() {
		System.out.println("class A fun");
	}

	private void privateMethod() {

	}
	
}

class B extends A {
	public int privateI;
	static int i;

	
	private void privateMethod() {

	}

	protected void finalize() {

	}

	B() {
		super.privateI = 9;
		System.out.println("B contructor");
	}

	B(String a) {
		super("");
		System.out.println("B contructor 1");
	}

	static void staticMethod() {
		System.out.println("Child Static method");
	}

	B method() throws ArithmeticException  {
		System.out.println("method from B");
		return new B();
	}

	void fun() {
		System.out.println("class B fun");
	}

	void methodB() {

	}
}

public class InheritanceExample extends B {
	InheritanceExample() {
		System.out.println("static");
	}

	public static void main(String[] args) {

		A a = new B();
		B b = new B();
		a.staticMethod();
		b.staticMethod();
		A.staticMethod();
		B.staticMethod();
		
		
	}
}
