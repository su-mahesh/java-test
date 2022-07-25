package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TranformArray {
	public static int[] transformArray(int[] a)
	{
		int length = a.length, len = a.length;
		for(int i = 0; i < len; i++)
		{
			// check if value is multiplication of 5
			if(a[i] % 5 == 0)
			{
				//copy value in temp
				int temp = a[i];
				//shift array left by 1 place
				for(int j = i; j < length - 1; j++)
				{
					a[j] = a[j + 1];					
				}
				// add value to end of array
				a[length - 1 ] = temp;
				
				// decrease loop length since multiplication of 5 added to the end of the array
				len = len -1;
				
				//decrease index i since array is shifted to left by 1
				--i;
			}

		}
		return a;
	}
	
	public static Integer[] transformArray(Integer[] arr)
	{
		ArrayList<Integer> lst = 
	            new ArrayList<Integer>(Arrays.asList(arr));
	
		var size = lst.size();
		for(int i = 0; i < size; i++)
		{ 
			var item = lst.get(i);
			if(item % 5 == 0)
			{
				lst.add(item);
				
			}
			
		}
		lst.removeIf(value -> value == 0);
		
		//Integer[] objects = (Integer[]) lst.toArray();
		
		Integer[] arr1 = new Integer[lst.size()];
		arr1 = lst.toArray(arr1);
      
        
		
		return arr1;
	}
	public static void main(String[] args) {
		/*
		 * Integer[] a = new Integer[] {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21}; var
		 * output = transformArray(a); for(Integer i: output) {
		 * System.out.print(i+", "); } System.out.println();
		 * 
		 * Integer[] a1 = new Integer[] {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21}; var
		 * output1 = transformArray(a1); for(Integer i: output1) {
		 * System.out.print(i+", "); }
		 */
		
		int[] a = new int[] {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		var output = transformArray(a);
		System.out.print("[");
		for(int i: output)
		{			
			System.out.print(i+", ");
		}
		System.out.print("]");
		int arr[]={2,4,8,5,12,15,6,10,10,7,30,25,43,46,45,21};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]%5!=0)
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
System.out.println(arr[i]+" ");
		}
	}

}
