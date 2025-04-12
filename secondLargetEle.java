package test;

import java.util.Arrays;

public class secondLargetEle {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//lighter element should be pop first
			int arr[] = {10,100,50,20,5};
			int temp;
			boolean swap = false;
			int size = arr.length;
			for(int i=0; i<size; i++)//10
			{
				for(int j=0; j<size-1; j++)//100
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
			System.out.println("Second largest after sorting : " + arr[size-2]);

		}
	}

