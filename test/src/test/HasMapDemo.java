package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {
	static final int serialVersionUID = 0;
	int id = 333;
	 String s = "hgfh";
	@Override
	public String toString() {
		return "Demo [id=" + id + ", s=" + s + "]";
	}	
}

class Demo1 implements Serializable {
	int id = 333;
	String s;
}

public class HasMapDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(new Demo());

		FileInputStream fin = new FileInputStream("f.txt");
		ObjectInputStream inp = new ObjectInputStream(fin);

		System.out.println((Demo) inp.readObject());

	}

}
