package ThreadExample.ThreadGroup;

import java.util.Iterator;
import java.util.stream.Collectors;

class MyThread extends Thread {

	public MyThread(ThreadGroup tg, String string) {
		super(tg, string);
	}

	public void run() {
		for (int i = 0; i < 500; i++) {

		}
	}
}

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup parentThreadGroup = Thread.currentThread().getThreadGroup().getParent();
		
		Thread[] ts = new Thread[parentThreadGroup.activeCount()];
		
		parentThreadGroup.enumerate(ts);
		
		
		for (Thread thread : ts) {
			
			System.out.println(thread.getName());
		}
		
		System.out.println();
		
		
		
		ThreadGroup tg = new ThreadGroup("tg");

		MyThread t1 = new MyThread(tg, "t1");
		t1.start();
		System.out.println(tg.activeCount());

	}
}
