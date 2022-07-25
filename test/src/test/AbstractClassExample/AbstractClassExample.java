package test.AbstractClassExample;

abstract class Bike {
	abstract void run();
	public void print() {
		System.out.println("print");
	}
}

class Honda4 extends Bike {
	void run() {
		System.out.println("running safely");
	}
}

public class AbstractClassExample {

	public static void main(String args[]) {
		Bike obj = new Honda4();
		obj.run();
		obj.print();

	}

}
