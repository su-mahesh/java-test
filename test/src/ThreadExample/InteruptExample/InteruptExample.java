package ThreadExample.InteruptExample;

class MyThread extends Thread {
static Thread t;
	public void run() {
		
		try {
			System.out.println("child sleeping");
			//Thread.sleep(5000);
			t.join();
			for(int i= 0; i < 10; i++) {
				System.out.println("child thread");
				//Thread.currentThread().interrupt();
				
			}
			
		} catch (InterruptedException e) {
			System.out.println("child sleeping interuppted");
		}
		
	}
}
public class InteruptExample {

	
	public static void main(String[] args) {
		MyThread.t = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		for(int i= 0; i < 100; i++) {
			System.out.println("main thread");
		}
	}

}
