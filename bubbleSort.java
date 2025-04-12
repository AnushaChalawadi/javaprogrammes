package test;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lighter element should be pop first
		int arr[] = {10,100,50,20,5};
		int temp;
		boolean swap = false;
		for(int i=0; i<arr.length; i++)//10
		{
			for(int j=0; j<arr.length-1; j++)//100
			{
			if(arr[j]>arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swap=true;
			}
			}
			if(swap==false)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}

