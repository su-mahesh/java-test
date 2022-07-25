package test.InheritanceExample;

class A1 {
}
class A2 {
}

class B1 extends A1 {
}

class C1 extends A1 {
}

public class MethodCall {

	/*
	 * static void method(B1 b) { System.out.println("B1");
	 * 
	 * }
	 */
	 

	static void method(A1 b) {
		System.out.println("A1");

	}
	static void method(C1 b) {
		System.out.println("C1");

	}

	/*
	 * static void method(A2 b) { System.out.println("A2");
	 * 
	 * }
	 */
	
	  static void method(Object a) { System.out.println("A1");
	  
	  }
	 

	/*
	 * static void method(String a) { System.out.println("A1");
	 * 
	 * }
	 */

	public static void main(String[] args) {

		method(null);
	}

}
