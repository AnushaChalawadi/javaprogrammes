package test;

import java.util.HashMap;
import java.util.Scanner;

public class StringWordOccuranceAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		
		String[] words = sc.nextLine().trim().split("\\s+");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i=0 ; i<words.length;i++)
		{
			if(hm.containsKey(words[i]))
			{
				continue;
			}
			
			int count = 0;
			for(int j=i ; j<words.length;j++)
			{
			if(words[i].equals(words[j]))
				{
					count++;
				}
			}
			
			hm.put(words[i], count);
			
		}
		
		 System.out.println(hm);

	}

}
