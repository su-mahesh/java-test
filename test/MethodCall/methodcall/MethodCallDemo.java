package methodcall;

class Test {
	Test() {

	}

	Test(double a) {
		System.out.println("a = " + a);
	}

	Test(int a, int b) {
		System.out.println("a = " + a + " b = " + b);
	}

	Test(int a, float b) {
		System.out.println("a = " + a + " b = " + b);
	}

	static void m(double a) {
		System.out.println("a = " + a);
	}
}

public class MethodCallDemo {
	public static void main(String args[]) {
		byte a = 10;
		byte b = 15;
		int i = 1;
		
		Test.m(i);
		
		
		
		Test test = new Test(a);
	}

}
