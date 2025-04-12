package test;
import java.util.HashMap;

public class TwoSumDs{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {2,4,5,7,11,15};
		int target =9;
                HashMap<Integer,Integer> hm = new HashMap<>();
		        for(int i=0;i<nums.length;i++)
		        {
                    int key = target-nums[i];
                    if(hm.containsKey(nums[i]))
                    {
                        System.out.println(nums[i] + ":" + hm.get(nums[i]));

                    }
                    else{
                        hm.put(key,nums[i]);
                    }
                }
            }
        }


		        	
