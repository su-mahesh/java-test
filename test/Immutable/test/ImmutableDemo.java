package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyClass1 {

	int id;

	@Override
	public String toString() {
		return "MyClass1 [id=" + id + "]";
	}

	MyClass1(int id) {
		this.id = id;
	}
}

final class Immutable {

	final Integer i;
	final int j;
	private final int[] a;
	private final List<MyClass1> list;

	public Immutable(Integer i, int j, int[] a, List<MyClass1> list) {
		this.i = i;
		this.j = j;
		this.a = a.clone();
		this.list = new ArrayList<MyClass1>(list);
	}

	public Integer getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public int[] getA() {
		return a.clone();
	}

	public List<MyClass1> getList() {
		return new ArrayList<MyClass1>(list);
	}
}

public class ImmutableDemo {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4 };
		List<MyClass1> list = new ArrayList<MyClass1>
		(Arrays.asList(new MyClass1(1), new MyClass1(2)));
		Immutable im = new Immutable(1, 2, a, list);

		System.out.println(im.getA()[1]);
		im.getA()[1] = 9;

		System.out.println(im.getA()[1]);
		
		im.getList().add(null);
		System.out.println(im.getList());

	}

}
