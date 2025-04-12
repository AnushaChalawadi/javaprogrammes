package test;

import java.util.HashMap;
import java.util.Scanner;

public class FrequenceOfElements {

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
		
		HashMap<Integer,Integer > hm = new HashMap<>();
		for(int i=0;i<size;i++)
		{
			int num=array[i];
			if(hm.containsKey(array[i]))
			{
				hm.put(num, hm.get(num)+1);
			}
			else
			{
				hm.put(num, 1);
				
			}
		}
		for(Integer key : hm.keySet())
		{
			System.out.println(key + ":" + hm.get(key) + ", ");
		}
		


	}

}
