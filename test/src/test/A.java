package test;

/*class G {
	public static final void main(String[] args) {
	}
}*/

public class A {

	A() {
		System.out.println("constructor");
	}

	A(String a) {
		System.out.println("constructor 1");
	}

	int a;
	static int i;
	char c;

	public void print() {
		System.out.println("print " + a);
		System.out.println("char \"" + c + "\"");
	}

	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}

	public static final void main(String[] args) {

		int[] no = { 3, 7, 5, 6, 7, 4, 6, 3, 0 };
		int length = no.length;

		/*
		 * int j = 1; int i; for (i = 0; i < length - 1;) {
		 * 
		 * if (no[i] + no[j] == 10) { System.out.println("10 = " + no[i] + " + " +
		 * no[j]); } j = j < length - 1 ? j + 1 : i + 1; i = j < length - 1 ? i : i + 1;
		 * }
		 */
		
		int j = 1; 
		int i;
		
		for (i = 0; i < length - 1 && j < length ; i++) {

			if(no[i] + no[j] == 10)
			System.out.println("10 = " + no[i] + " + " + no[j]);
			j++;
		//	j = j < length - 1 ? j + 1 : i + 1;
	//		i = j < length - 1 ? i : i + 1;
		}
		/*
		 * for (int i = 0; i < length; i++) { for (int j = i + 1; j < length; j++) { if
		 * (no[i] + no[j] == 10) { System.out.println("10 = " + no[i] + " + " + no[j]);
		 * } } }
		 */
	}
}