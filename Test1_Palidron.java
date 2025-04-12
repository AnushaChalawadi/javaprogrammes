package test;

public class Test1_Palidron {

	public static void main(String[] args) {
		String s ="madam";
        String t ="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);

        }
        System.out.println(t);

        if(s.equals(t)){
            System.out.println("This is a palindrome");
        }
        else
        {
            System.out.println("This is not a palindrome");
        }
    }
}
