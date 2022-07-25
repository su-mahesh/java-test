package PatternEample;

public class Pattern {

	static void print(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*     ");

		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("*     ");

		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("* * * ");

		}

	}

	public static void main(String[] args) {
		
		print(6);
	}

}
