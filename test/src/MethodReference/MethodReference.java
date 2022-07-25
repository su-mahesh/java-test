package MethodReference;

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class MethodReference {
	public static int ThreadStatus() {
		System.out.println("Thread is running...");
		return 0;
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(MethodReference::ThreadStatus);
		Thread t3 = new Thread(()->{System.out.println("Lambda Thread is running...");});
		t2.start();
		t3.start();

		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}