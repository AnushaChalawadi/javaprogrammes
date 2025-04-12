package test;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {2,7,11,15};
		int target =9;
		int sum=0;
		boolean flag =false;
		        for(int i=0;i<nums.length;i++)
		        {
		        	for(int j=i+1;j<nums.length;j++)
		        	{
		            if(nums[i] + nums[j]==target)
		            {
						System.out.println(nums[i] + ":" + nums[j]);	
						flag=true;	              

		            }
	               }
	            }
		if(!flag)
		{
			System.out.println("No pair Found!!!!..");

		}
	}
}



