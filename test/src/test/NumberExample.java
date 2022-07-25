package test;

public class NumberExample {

	public static int ReverseNumber(int num)
	{
		int reverse = 0;
		while( num / 10 > 1)
		{
			reverse = num % 10;
		}		
		
		return reverse;
	}
	public static void main(String[] args) {
		
	}

}
