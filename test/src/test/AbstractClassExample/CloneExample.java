package test.AbstractClassExample;

//A test class whose objects are cloned
class Test implements Cloneable {
	int x, y;

	Test() {
		x = 10;
		y = 20;
	}
public void set(Integer i)
{
	i = 10;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Test get() {
		return this;
	}
}

//Driver Class
class CloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test ob1 = new Test();

		System.out.println(ob1.x + " " + ob1.y);

		// Creating a new reference variable ob2
		// pointing to same address as ob1
		Test ob2 = ob1;
		Test ob3 = (Test) ob1.clone();
		Integer i = 5;
		int j = i;
		ob1.set(i);
		System.out.println(i);
		
		// Any change made in ob2 will
		// be reflected in ob1
		ob2.x = 100;

		System.out.println(ob1.x + " " + ob1.y);
		System.out.println(ob2.x + " " + ob2.y);
		System.out.println(ob3.x + " " + ob3.y);
	}
}
