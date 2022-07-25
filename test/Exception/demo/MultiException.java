package demo;

public class MultiException {
	
	static int m() {
		try {
			throw new Exception();
		} catch (Exception e) {
			return 1;
		} finally {
			return 2;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(m());
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}

		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | Error e) {
			System.out.println(e.toString());
		}
	}
}
