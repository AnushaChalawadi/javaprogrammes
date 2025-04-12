package test;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Hello world ";
		String str1 = str.trim();
		int length=0;
		
        for(int i=str.length()-1;i>=0;i--)
        {
        	if(str.charAt(i)!= ' ')
        	{
        		length++;
        		
        	}
        	else if(length>0)
        	{
        		break;
        	}
        }
        System.out.println(length);   
	}

        	
     }
		


