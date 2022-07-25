package ThreadExample.wait;

class MyThread extends Thread {
	int total = 0;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < 1000; i++) {
				total += i;
			}
			this.notify();
		}

	}
}

public class WaitExample {

	public static void main(String[] args) {

		MyThread t = new MyThread();

		t.start();
		
		try {
			Thread.sleep(10);
			synchronized (t) {
				t.wait();
			}

		} catch (Exception e) {

		}

		System.out.println(t.total);

	}

}
