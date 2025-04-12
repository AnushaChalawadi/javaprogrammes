package test;

public class BuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,1,5,3,6,4};
		
		int result=0;
		int maxres =0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				result = arr[j]-arr[i];	
//				System.out.println(result);

			}
			if(maxres<result)
			{
				maxres=result;
				
			}
		}
		System.out.println(maxres);

	}

}
