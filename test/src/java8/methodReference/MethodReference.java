package java8.methodReference;

import java.util.function.BiFunction;
import java.util.function.Predicate;

interface BiFun<E> {
	E apply();
}

class A {
}

class B extends A {
}

@FunctionalInterface
interface functional {
	void get();
}

interface functional1 {
	void get(int i);
}

interface functional2 {
	void get(float i);
}

interface functional3 {
	float get(float i);
}

interface functional4 {
	int get(float i);
}

interface functional5 {
	A get();
}

class MyClass {

	static void m() {
		System.out.println("myclass m()");
	}

	static int m1() {
		System.out.println("myclass m1()");
		return 1;
	}

	static int m2(int i) {
		System.out.println("myclass m1()");
		return 1;
	}

	static Integer m3(float i) {
		return 1;
	}

	static Float m4(float i) {
		return 1f;
	}

	static double m5(float i) {
		return 1;
	}

	static B m6() {
		return new B();
	}
	static Integer m7(Integer a, int b) {
		return 1;
	}
	static Integer m8() {
		return 1;
	}
}

public class MethodReference {

	public static void main(String[] args) {

		functional f = MyClass::m1;

		functional1 f1 = MyClass::m3;

		functional3 f3 = MyClass::m4;
		
		BiFunction<Integer, Integer, Integer> adder = MyClass::m7;
		
		BiFun<Integer> fn = MyClass::m8;

		System.out.println(adder.apply(2, 8));
	}

}
