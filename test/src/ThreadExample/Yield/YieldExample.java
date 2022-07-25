package ThreadExample.Yield;

class MyThread1 extends Thread {
	String s = "";

	MyThread1(String s) {
		this.s = s;
	}
	public void run(){
		for (int i = 0; i < 500; i++) {
			if (i == 1) {
				System.out.println(Thread.currentThread().getName() + " yielding");
				Thread.yield();

			}
			System.out.println("Thread " + s + " executing " + i);
		}
	}
}

class MyThread implements Runnable, Cloneable {

	String s = "";

	MyThread(String s) {
		this.s = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			if (i == 1 && Thread.currentThread().getName().equals("1")) {
			//	System.out.println("Thread "+Thread.currentThread().getName() + " yielding");
				//Thread.yield();

			}
			System.out.println("Thread " + s + " executing " + i);
		}

	}

	@Override
	protected MyThread clone() throws CloneNotSupportedException {
		return (MyThread) super.clone();
	}

}

public class YieldExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyThread("1"));
		t1.setName("1");
		Thread t2 = new Thread(new MyThread("2"));
		t2.setName("2");
		Thread t3 = new Thread(new MyThread("3"));
		t3.setName("3");
		Thread t4 = new Thread(new MyThread("4"));
		t4.setName("4");
		Thread t5 = new Thread(new MyThread("5"));
		t5.setName("5");
		
		/*
		 * t1.setPriority(6); t2.setPriority(6); t3.setPriority(6); t4.setPriority(6);
		 * t5.setPriority(6);
		 */

		t1.suspend();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		for (int i = 0; i < 500; i++) {
			System.out.println("Main Thread executing " + i);
		}
	}

}
