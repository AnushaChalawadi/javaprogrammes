package test;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		
		int size = sc.nextInt();//Declare an Array
		int[] array = new int[size];
		
		//Enter elements in an Array
		System.out.println("Enter " + size + " elements of an Array");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
		//Create an array to store unique values
		int[] result = new int[size];
		int resultsize=0;
		
		for(int i=0;i<array.length;i++)
		{
			boolean isduplicate=false;
			for(int j=0;j<resultsize;j++)
			{
			if(array[i]==result[j])
			{
				isduplicate = true;
				break;
			}
				
			}
			if(!isduplicate)
			{
				result[resultsize] = array[i];
				resultsize++;
			}
			}
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(result, resultsize)));

	}

}
