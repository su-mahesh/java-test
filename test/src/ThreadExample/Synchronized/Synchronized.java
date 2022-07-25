package ThreadExample.Synchronized;

class test {
	public void m() {
		synchronized (this) {
			
			for (int i = 0; i < 5; i++) {
				System.out.println("test object "+i);
				try {

					// Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	void present(String name) {
		synchronized (test.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println("test wish " + name);
				try {

					// Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Display {
	Integer state;
	String status;

	synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("wish " + name);
			try {
				this.wait();
				// Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void present(String name) {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("wish " + name);
				try {

					// Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}
class MyThread2 extends Thread {
	test d;
	String name;

	MyThread2(test d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		 d.m();
		//d.present(name);
	}
}
class MyThread1 extends Thread {
	test d;
	String name;

	MyThread1(test d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		// d.wish(name);
		d.present(name);
	}
}

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		// d.wish(name);
		d.present(name);
	}
}

public class Synchronized {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Display d = new Display(); Display d1 = new Display(); Display d2 = new
		 * Display(); Display d3 = new Display(); Display d4 = new Display(); Display d5
		 * = new Display();
		 */

		/*
		 * MyThread t1 = new MyThread(d1, "1"); MyThread t2 = new MyThread(d2, "2");
		 * MyThread t3 = new MyThread(d3, "3"); MyThread t4 = new MyThread(d4, "4");
		 * MyThread t5 = new MyThread(d5, "5");
		 */

		test d = new test();
		test d1 = new test();
		test d2 = new test();
		test d3 = new test();
		test d4 = new test();
		test d5 = new test();
		test d6 = new test();

		MyThread1 t1 = new MyThread1(d1, "1");
		MyThread1 t2 = new MyThread1(d2, "2");
		MyThread1 t3 = new MyThread1(d3, "3");
		MyThread1 t4 = new MyThread1(d4, "4");
		MyThread1 t5 = new MyThread1(d5, "5");
		
		MyThread2 t6 = new MyThread2(d6, "5");

		t1.start();
		
		t2.start();
		t3.start();
	//	Thread.sleep(1000);
		t6.start();
		t4.start();
		t5.start();
	

	}

}
