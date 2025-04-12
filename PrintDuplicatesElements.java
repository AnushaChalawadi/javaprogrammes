package test;

import java.util.HashMap;

public class PrintDuplicatesElements {

    public static void main(String[] args) {
        int[] array = {2,1,3,2,3,4};

        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<array.length;i++)
        {
            if(hm.containsKey(array[i]))
            {
                hm.put(array[i], hm.get(array[i])+1);
            }
            else
            {
                hm.put(array[i], 1);
            }
        }

        //reterive all athe values using keyset  
		for(Integer key: hm.keySet())
		{
			System.out.println(key + " appears : " + hm.get(key) + ", ");
			
		}
    }
}

        
        
    