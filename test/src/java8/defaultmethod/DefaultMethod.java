package java8.defaultmethod;

interface Ia {
	default void m() {
		System.out.println("Ia");
	}

	public static void mt() {
		System.out.println("Static Ia");
	}
}

interface Ib {
	default void m() {
		System.out.println("Ib");
	}

	static void mt() {
		System.out.println("Static Ib");
	}
}

class A implements Ia, Ib {
	public void m() {

		Ia.super.m();
		
	}

	static void mt1() {
			
		System.out.println("A Static");
	}

}

class B extends A {
	static void mt() {

		System.out.println("B Static");
	}
}

public class DefaultMethod implements Ia {

	public static void main(String[] args) {
		
	}

}
