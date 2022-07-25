package AbstractExample;

interface inf {

	void interfaceMethod();
}

abstract class abtClass implements inf {

	abstract void fun();
}
class classA{
	public void interfaceMethod() {
		// TODO Auto-generated method stub

	}

	void fun() {
		// TODO Auto-generated method stub

	}
}
class classB extends classA implements inf{
	
}

class abstractInterfaceChild extends abtClass {
	public void interfaceMethod() {
		// TODO Auto-generated method stub

	}

	void fun() {
		// TODO Auto-generated method stub

	}
}

public abstract class AbstractClass {

	public AbstractClass() {
		System.out.println("AbstractClass constructor");
	}

	abstract void fun();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child();
	}

}

class child extends AbstractClass {

	@Override
	void fun() {
		// TODO Auto-generated method stub

	}
}
