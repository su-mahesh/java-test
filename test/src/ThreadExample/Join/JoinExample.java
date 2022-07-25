package ThreadExample.Join;

class Thread1 implements Runnable {

	@Override
	public void run() {
		
	}

	
}

class MyThread extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("child thread " + i);
			}
//			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();

		
		
		t.start();

		t.join(1);
		for (int i = 0; i < 100; i++) {
			System.out.println("main thread " + i);
		}
	}
}
