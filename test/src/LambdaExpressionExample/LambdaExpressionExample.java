package LambdaExpressionExample;


@FunctionalInterface
interface Interf{
	int a();
	default int b() {
		return 0;}
	default int d() {
		return 0;}
}
class Lambda
{
	int y = 0;
	void m() {
		int x = 0;
		int a = 3;
		Interf j = ()-> a;
		System.out.println(j.a());
		
	}
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		new Lambda().m();
		
	}

}
