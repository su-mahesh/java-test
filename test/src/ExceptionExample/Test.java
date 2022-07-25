package ExceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class A extends
//RuntimeException
//IOException
		Error {

}

class B extends Error {

	String message = "error";

	public B() {
		super("error");
	}

}

class C extends Exception {

	C() {
		super("C ex");
	}

}

class D extends RuntimeException {

	public D() {
		super("D");
		// TODO Auto-generated constructor stub
	}

}

public class Test extends Error {

	static Exception ex = new Exception("ex");
	static ArithmeticException ae = new ArithmeticException("ex");
	static InterruptedException ie = new InterruptedException("ex");
	static InterruptedException ie1;

	static void method1() throws InterruptedException {
		Thread.sleep(0);
	}

	static void method2() throws RuntimeException {

	}

	static int calculateFactorial(int number) {
		System.out.println(number);
		if (number == -21000) {
			return 0;
		}
		return number * calculateFactorial(number - 1);
	}

	static void method3() throws IOException {
		throw new IOException("IO");
	}

	static void method4() {

		if (true) {
			throw new D();
		}
	}

	public static void main(String[] args) throws RuntimeException, InterruptedException {

		int i;

		try {
			i = 0 / 0;
			Thread.sleep(0);
		} catch (Throwable e) {
		//	System.out.println(e);
			//Thread.sleep(0);
		} finally {
			System.out.println("finally");
		}

	}
}
