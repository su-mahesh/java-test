package serializabledemo;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

class P {}
class A extends P implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int i;
	String s;
	String s1;
	
	public A(int i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
	//	return "A [i=" + i + ", s=" + s + "]";
		 return "A [i=" + i + ", s=" + s + ", s1 = "+s1+"]";
	}
	
	
	 
}
class B implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int i;
	String s;
	String s1;
	
	public B(int i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
	//	return "A [i=" + i + ", s=" + s + "]";
		 return "A [i=" + i + ", s=" + s + ", s1 = "+s1+"]";
	}
	
}
public class SerializableDemo {

	public static void main(String[] args) {
		try {
			A a = new A(1, "a");
			
		//	  ObjectOutput out = new ObjectOutputStream(new
	//		  FileOutputStream("E://desktop/file.text")); out.writeObject(a); out.close();
			 

			ObjectInput in = new ObjectInputStream(new FileInputStream("E://desktop/file.text"));

			 P a1 = (P) in.readObject();
			in.close();

			System.out.println("instance1 :- " + a);
			System.out.println("instance2 :- " + a1);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
