package ThreadExample;

class extend {
	extend() {
		System.out.println("de");
	}

	extend(String s) {
	}
}

class MyRunnable extends extend implements Runnable {

	MyRunnable(String s) {
		System.out.println("myrun");
		// super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("Thread running "+Thread.currentThread().getName());
		System.out.println("run method");
	}

	public void method() {

	}
}

class Mythread extends Thread {
	// Mythread(){}
	public Mythread(Runnable target) {

		super(null, target, "Thread-T", 0);
	}

	public Mythread(MyRunnable run) {
		// TODO Auto-generated constructor stub }
	}

	@Override
	public void start() {
		super.start();
		for (int i = 0; i < 1000000; i++) {

		}
		System.out.println("start method");
		{
			System.out.println("block in method");
		}
	}

	@Override
	public void run() {
		System.out.println("Thread running "+Thread.currentThread().getName());
		Thread.currentThread().setPriority(5);
		System.out.println("Mythread thread priority "+Thread.currentThread().getPriority());
//		System.out.println("run method");
		System.out.println("thread name: " + Thread.currentThread().getName());
		
		Thread t = new Thread();
		
		System.out.println("Mythread child thread priority "+t.getPriority());
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		
		
		
		Thread.currentThread().setPriority(10);

		System.out.println("main thread priority "+Thread.currentThread().getPriority());
		MyRunnable run = new MyRunnable("");

		Mythread mt = new Mythread(run);
		mt.start();

		System.out.println("thread name: " + mt.getName());
		System.out.println("thread name: " + Thread.currentThread().getName());

		for (int i = 0; i < 10000; i++) {
		}
		System.out.println("total threads: " + Thread.activeCount());

	}

}
