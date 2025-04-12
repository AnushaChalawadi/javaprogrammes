package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadinputFromFile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		String filePath = "src/Test/input.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		int startnum = Integer.parseInt(br.readLine());
		int endnum = Integer.parseInt(br.readLine());
		
		if(startnum>endnum)
		{
			System.out.println("startnum is greater than endnum");
			System.exit(1);
		}
		
		for(int i=startnum; i<=endnum;i++)
		{
			if(i%2==1)
			{
				System.out.println("Old Numbers are : "+ i );
			}
		}
		}


}
