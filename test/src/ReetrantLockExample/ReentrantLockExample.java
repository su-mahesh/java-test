package ReetrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	public static void main(String[] args) {
		
		ReentrantLock  l = new ReentrantLock();
		Runnable t = new Runnable() {public void run(){}};
		for(int i = 0; i < 5; i++)
		{
			l.lock();
		}
		
		l.unlock();
		System.out.println(l.getHoldCount());
	}

}
