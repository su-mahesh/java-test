package cloneable;

class MyClass implements Cloneable {
	private int i;
	private int j;

	@Override
	public MyClass clone() throws CloneNotSupportedException {
		return (MyClass) super.clone();
	}
}

public class CloneableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println(new MyClass().hashCode());
		System.out.println(new MyClass().clone().hashCode());

	}

}
