package java8.ConstructorReference;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

class m extends Message {

	m(String msg) {
		super(msg);
		System.out.println("child");
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		
		hello = m::new;
		hello.getMessage("Hello");

	}
}
