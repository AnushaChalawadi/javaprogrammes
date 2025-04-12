package test;

public class FindCommonInTwoArrays {
	
	public static void main(String[] args)
	{
		int[]  array1 = {-1,10,20,30,10,100,100};
		
		int[]  array2 = {10,100,150,50,-1};
		
		//Find Unique numbers from Array 
		//HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array2.length; j++)
			{
                if(array1[i]==array2[j])
				{
                	System.out.println("common numbers are:" + array1[i]);
				}
                                
			}

		}
			
		
		
	}

}
