/**
 * 
 * 
 * 
 * count of zero 
 */


public class Solution {
	
public int[] productExceptSelf(int[] nums) {
	
	int mul=1;
	
	int countZeroes=0;
	for(int n : nums)
	{
		if(n==0)
		{
			countZeroes++;
		}
		else
		{
		mul=mul*n;
		}
	}
	
	
	for(int i=0;i<nums.length;i++)
	{
		if(countZeroes==0)
		{
		
		nums[i]=mul/nums[i];
		}
		else
		{
			if(countZeroes==1)
			{
				if(nums[i]!=0)
				{
					nums[i]=0;
					
				}
				else
				{
					nums[i]=mul;
				}
			}
			else
			{
				nums[i]=0;
			}
		}
	}
	return nums;
        
    }

public static void main(String args[])
{
	int nums[]= {-1,1,0,-3,3};
	
	Solution s = new Solution();
	
	int res[]=s.productExceptSelf(nums);
	System.out.println(res);
}

}
