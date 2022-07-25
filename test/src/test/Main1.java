package test;

class Print {

	static int count = 1;
	static int N = 100;

	synchronized void printOddNumber() {

		while (count < N) {
			if (count % 2 == 0) {

				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(count);
			count++;
			notify();
		}
	}

	synchronized void printEvenNumber() {

		while (count < N) {
			if (count % 2 == 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}System.out.println(count);
			count++;
			notify();

		}
	}
}

public class Main1 {

	public static void main(String[] args) {

		Print p = new Print();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				p.printOddNumber();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				p.printEvenNumber();
			}
		});
		
		t1.start();
	//	t2.start();

	}

}
