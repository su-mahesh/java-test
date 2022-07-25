package control.examples;

public class BreakKeyword {

	static public void breakForloop() {
		for (int i = 0; i < 10; i++) {
			if (true) {

				System.out.println("java");
				break;

			}
		}
	}

	static public void returnVoid() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				
				return;

			}
		}
	}
	

	public static void main(String[] args) {

	//	breakForloop();
	//	returnVoid();
		
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 0) {				
				continue;
			}
			System.out.println(i);
		}
	}

}


