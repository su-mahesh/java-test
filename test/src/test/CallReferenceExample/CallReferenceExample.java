package test.CallReferenceExample;

import java.util.Arrays;

class Operation {
	Integer data = 50;

	void change(Operation op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}
}

public class CallReferenceExample {
	static void change(Operation o) {
		o.data = 1;
	}

	/** The cube method */
	static void change(Integer i) {
		i = 1;
		System.out.println(i);
	}
	static void change(Integer[] i) {
		i[0] = 6;
	}
	static void change(int i) {
		i = 1;
	}
	public static void main(String args[]) {
		int[] a = {1,2,3};
		Integer[] a1 = {1,2,3};
		
	}
}