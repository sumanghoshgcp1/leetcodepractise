class Solution {
	
	public static void main(String args[])
	{
		
		int nums[]= {1,1,1,1,1,1,1,1};
		int target=11;
		
		Solution s = new  Solution();
		
		int res = s.minSubArrayLen(target, nums);
		
		System.out.println(res);
		
	}
    public int minSubArrayLen(int target, int[] nums) {
    	
    	int i=0;
    	int j=i+1;
    	
    	if(nums.length==1)
    	{
    		if(nums[0]>=target)
    		{
    			return 1;
    		}
    		else
    		{
    			return 0;
    		}
    	}
    	
    	int sum=nums[i]+nums[j];
    	int minlen = Integer.MAX_VALUE;
    	do 
    	{
    		
    		if(nums[i]>=target || nums[j]>=target)
    			return 1;
    		
    		
    		if(sum<target)
    		{
    			j++;
    			if(j>nums.length-1)
        		{
        			break;
        		}
    			
    			sum=sum+nums[j];
    		}
    		else
    		{
    			int templen=(j-i)+1;
    			if(templen<minlen)
    			{
    				minlen=templen;
    			}
    			
    			sum=sum-nums[i];
    			i++;
    			
    			
    		}
    		
    		
    	}
    	while(!(j==nums.length-1 && i==j));
    	
    	return minlen==Integer.MAX_VALUE?0:minlen;
        
    }
}