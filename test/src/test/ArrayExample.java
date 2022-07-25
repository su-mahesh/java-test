package test;

public class ArrayExample {

	// Find Second Highest number in array
	public static int findSecondHighestNumber(int[] a) {
		int max = 0;
		int secondmax = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondmax = max;
				max = a[i];				
			}
			else if (a[i] > secondmax) {
				secondmax = a[i];
			}
		}
		return secondmax;
	}

	public static void main(String[] args) {
		int[] a = {110,120,125,1,122,3,140,5,6};
		int val = findSecondHighestNumber(a);
		System.out.println(val);
		}

}
