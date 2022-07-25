package ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		MyThread[] t = new MyThread[] {
				new MyThread(),
				new MyThread(),
				new MyThread(),
				new MyThread(),
		};
		
		for(var item : t)
		{
			service.submit(item);
		}
		
		service.shutdown();
		service.submit(new MyThread());
	}

}
