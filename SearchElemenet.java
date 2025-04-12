package test;

import java.util.Scanner;
public class SearchElemenet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		//Enter size of an Array
		System.out.println("Enter Size of an Array");
		int size = sc.nextInt();
		
		//Declare an Array
		int[] array = new int[size];
		
		//Enter elements in an Array
		System.out.println("Enter " + size + " elements of an Array");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search for : ");
		int target = sc.nextInt();
		
		int index = -1;//No found
		for(int i=0;i<array.length;i++) {
		if(array[i]==target)
		{
			index = i;
			break;
			
		}
	}
        // Display the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
}

}
