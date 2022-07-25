package test;

class Animal {
	public Animal() {
		System.out.println("Animal created");
	}
	public Animal(String s) {
		color = s;
	}
	static void m() {}
	String color = "white";

	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	public Dog() {
		super("pink");
		System.out.println(super.color);
		System.out.println("Dog created");
	}
	String color = "black";

	void eat() {
		
		super.eat();
		System.out.println("eating bread...");
	}

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class

	}
}

public class SuperExample {
	static final int data;//static blank final variable  
	//static int d;
	static {int d = 6;}
	  static{ data=50;} 
	  static void print() {
		  System.out.println(data);
	  }
	public static void main(String[] args) {
		
	}
}
