class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	
    	int left=0;
    	int right=numbers.length-1;
    	
    	int res[] =new int[2];
    	
    	while(left<right)
    	{
    		int leftnum=numbers[left];
    		
    		int rightnum=numbers[right];
    		int sum=leftnum+rightnum;
    		
    		if(sum==target)
    		{
    			res[0]=left+1;
    			res[1]=right+1;
    			
    			break;
    		}
    		else
    		{
    			if(sum>target)
    			{
    				right--;
    			}
    			else
    			{
    				left++;
    			}
    			
    		}
    	}
    		
    	return res;
        
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	
    	int numbers[]= {-1,0};
    	
    	int target=-1;
    	
    	
    	System.out.println(s.twoSum(numbers, target));
    	
    }
}