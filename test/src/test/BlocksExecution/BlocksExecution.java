package test.BlocksExecution;

public class BlocksExecution {

	public int i = 1;
	// Initializer block ends

	public BlocksExecution() {

		System.out.println("Default Constructor invoked");
	}

	public BlocksExecution(int x) {

		System.out.println("Parameterized constructor invoked");
	}

	// Initializer block starts..
	{
		// This code is executed before every constructor.
		System.out.println("Initializer block invoked !!");
	}

	// static block starts..
	static {

		System.out.println("Static block invoked !!");
	}

	static void staticMethod(Integer i) {
		i++;
	}
	static void staticMethod(BlocksExecution b) {
		b.i++;
	}
	static char c;

	public static void main(String arr[]) throws ClassNotFoundException {

		/*
		 * int n = 383; byte b = (byte) n;
		 * 
		 * System.out.println(b); BlocksExecution bk =new BlocksExecution();
		 */
		
		
		  int i = 0; for (; i <= 10; i=i+1) { System.out.println(i); }
		 

	}

}
