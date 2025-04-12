package test;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,5};
		int index=0;
	    boolean isduplicate=false;
		
		int val=3;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				isduplicate = true;
				break;
			}
				
			if(!isduplicate)
			{
				arr[index] = arr[i];
				index++;
			}
			}
	
		
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, arr[index])));
}
}


