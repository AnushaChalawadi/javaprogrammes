package test;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(args[0]);
		for(int i=0;i<args.length;i++)
		{
			System.out.print(args[i]);
			
		//try {
		
	    int number=Integer.parseInt(args[i]);
		//}
		//catch(Exception e)
		//{
			
		int originalNum=number;
		int reverse_num=0;
			
		
		while(number>0)
		{
			int rem = number%10;
			reverse_num=reverse_num*10 +rem;
			number =number/10;
		}
		if(reverse_num==originalNum)
		{
			System.out.println(" Number is paindrome");
		}
		else
		{
			System.out.println(" Number is not a paindrome");
		}
		
		}
	}
	}

