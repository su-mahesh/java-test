package inheritance;

interface I {
}

class A implements I {
}

class B extends A {
}

class C extends B {
}

class Parent {
	I m() {
		return null;
	}
}

class Child extends Parent {

	@Override
	C m() {
		return null;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
