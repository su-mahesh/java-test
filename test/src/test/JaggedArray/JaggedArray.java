package test.JaggedArray;

public class JaggedArray {

	public static void main(String[] args) {
		
		
		int arr[][] = new int[2][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		for(int i = 0; i < arr.length; i++)
		{
			int len = arr[i].length;
			for(int j = 0; arr[i] != null && i < len; i++)
			{
				System.out.println("*");
			}
		}
		
	}

}
