package test;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		System.out.println("sonethig");
		
	
		int[] arr = {10,20,10,30,10,40};
		int count = 0;
		for(int i = arr.length;i<=0;i--)
		{
			for(int j = i;j<=0;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				System.out.println(count);
				}
	
		}
		System.out.println(Arrays.toString(arr));

	}


}
