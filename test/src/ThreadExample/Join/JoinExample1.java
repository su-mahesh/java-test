package ThreadExample.Join;

import java.util.Iterator;

class MyThread1 extends Thread {

	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i= 0; i < 500; i++) {
			System.out.println("child thread");
		}
	}
}

public class JoinExample1 {

	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().join();
		
		MyThread1.mt = Thread.currentThread();
		MyThread1 t = new MyThread1();
		
		t.start();
		for(int i= 0; i < 500; i++) {
			System.out.println("main thread");
		}

	}

}
