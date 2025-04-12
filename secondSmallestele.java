package test;

import java.util.Arrays;
import java.util.Scanner;

public class secondSmallestele {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array!!");

        //Delcare an Array
        int size = sc.nextInt();
        int[] array = new int[size];

        //Enter elements in an array.
        System.out.println("Enter " + size + " elements of an Array");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}

        int temp;
        boolean swap = false;

        for(int i =0;i<array.length;i++)
        {
            for(int j =0;j<array.length-1;j++)
            {

            if(array[j]<array[j+1])
            {

                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                swap=true;
            }
        }
            if(swap==false)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Second smallest element after sorting : " + array[size-2]);


    }
        

    }
