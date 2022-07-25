package ThreadScheduledTask;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

abstract class abs extends MyThread1 {
	@Override
	public void run() { 
		System.out.println("MyThread1");
	}
}

class MyThread1 extends Thread {
	
	@Override
	public void run() { 
		System.out.println("MyThread1");
	}
}
class MyThread implements Runnable {
	
	@Override
	public void run() {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
	}
}
public class ScheduledTask {
	public static void main(String[] args) {
		
		new MyThread1() {	public void run() { 
			System.out.println("anonymous");
		}{
			
		}}.start();
		
	//	ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	//	scheduler.scheduleAtFixedRate(new MyThread(), 5000, 5000, TimeUnit.MILLISECONDS);
		
		//scheduler.shutdown();
	}
}
