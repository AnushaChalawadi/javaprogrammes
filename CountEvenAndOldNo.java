package test;

public class CountEvenAndOldNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10,20,40,88,96,3};
		
		int Evencount =0;
		int OldCount =0;
		for(int i=0;i<array.length;i++)
		{
		if(array[i] % 2 ==0)
		{
			Evencount++;
		}
		else
		{
			OldCount++;
		}
		System.out.println("Even numbers count: " + Evencount);
		System.out.println("Old numbers count: " + OldCount);

	
}
	}
}
