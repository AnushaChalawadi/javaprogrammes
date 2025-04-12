package test;

public class FindIndexOfNum {
    public static void main(String[] args) {
        int[] array= {10,20,40,50,90};
        System.out.println(findIndex(array, 40));

    }


   public static int findIndex(int[] array ,int value)
   {
      for(int i =0;i<array.length;i++)
      {
        if(array[i]==value)
        {
            return i;

        }

      }
      return -1;

   }  
}  
