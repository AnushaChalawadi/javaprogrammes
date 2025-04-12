package test;

public class fibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First 10 numbers
		//0 1 1 3.....
		int N=10;
		int fib1=0;
		int fib2=1;
		int fib3;
		
		for(int i=2;i<N;i++)
		{
			 fib3 = fib1 + fib2;
			System.out.println(fib3);
			 fib1=fib2;
			 fib2=fib3;
		}
	}
	
}
