import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	
	public static void main(String args[])
	{
		
	}
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	
    	List<List<Integer>>  finallist = new ArrayList<List<Integer>>();
    	
    	Arrays.sort(nums);
    	
    	int i=0;
    	
    	while(nums[i]<=0)
    	{
    		if(i==0 || (i>0 && nums[i]!=nums[i-1]))
    		{
    			
    			int j=i+1;
    			int k= nums.length-1;
    			
    			int targetsum= nums[i]*-1;
    			
    			while(j<k)
    			{
    				if(j-1==i || (nums[j]!=nums[j-1]))
    				{
    					int tempsum= nums[j]+nums[k];
    					
    					if(tempsum==targetsum)
    					{
    						
    						List<Integer> tempList = new ArrayList<Integer>();
    						
    						tempList.add(nums[i]);
    						tempList.add(nums[j]);
    						tempList.add(nums[k]);
    						finallist.add(tempList);
    						j++;
    						k--;
    						
    					}
    					
    					if(tempsum<targetsum)
    					{
    						j++;
    						
    					}
    					
    					if(tempsum>targetsum)
    					{
    						k--;
    					}
    					
    					
    					
    				}
    				else
    				{
    					j++;
    				}
    			
    			}
    			
    			
    			
    		}
    		i++;
    	}
       
        
    	
    	return finallist;
    }
}