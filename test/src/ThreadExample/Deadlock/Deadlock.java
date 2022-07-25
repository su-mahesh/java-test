package ThreadExample.Deadlock;

class A {

	synchronized void a1(B b) {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		b.b1(null);
	}
	
	
}

class B {

	synchronized void b1(A a) {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		a.a1(null);
	}
}

public class Deadlock extends Thread{
	A a = new A();
	B b = new B();
	
	public void start() {
		super.start();
		a.a1(b);
	}
	
	public void run() {
		b.b1(a);
	}

	public static void main(String[] args) {
		Deadlock d = new Deadlock();
		
		d.start();
		
	}

}
