package ThreadCallableExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class MyThread implements Callable {
	
	@Override
	public Object call() {
		System.out.println(Thread.currentThread().getName());
		long j=0;
		for(long i = 0; i < 6; i++)
		{
			j = j+i;
		}
		return j;
	}
}

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
	//	Future f = service.submit(new MyThread());
		
	//	System.out.println(f.get());
		service.shutdown();
		FutureTask task = new FutureTask(new MyThread());
		
		Thread t = new Thread(task);
		t.start();
		System.out.println(task.get());
		
		
	}

}
