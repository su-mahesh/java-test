package test;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

class a1 {
	int a = 0;
	class s{}
}

class a2 extends a1 {
	int a = 1;
}

class a3 extends a2 {
	int a =3;
	void d(){
	}
}

public class Main {

	public static void main(String[] args) {
		
		  ObjectInput in 
          = new ObjectInputStream(new FileInputStream("file.text"));
      Singleton instance2 = (Singleton) in.readObject();
      in.close();
    
	}

}
