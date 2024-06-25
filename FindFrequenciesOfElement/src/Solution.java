import java.util.Arrays;

/**
 * find the frequencies of element 
 */
public class Solution {
	
	public static void main(String args[])
	{
		int nums[]= {1,5,2,1,5,7,2,5,7};
		
		Solution s = new Solution();
		
		int  freq= s.findFreq(nums, 7);
		
		System.out.println(freq);
	}
	
	
	int findFreq(int nums[],int k)
	{
		
		Arrays.sort(nums);
		
		int low =0;
		int high = nums.length-1;
		
		int lowindex= findLowIn(nums,k,low,high);
		
		int highindex=findHighIn(nums,k,low,high);
		
		return highindex-lowindex+1;
	}

	private int findHighIn(int[] nums, int k, int low, int high) {
		// TODO Auto-generated method stub
		
		
		int mid = (low+high)/2;
		
		if(nums[mid]<k)
		{
			return findHighIn(nums, k, mid+1, high);
			
		}
		
		if(nums[mid]>k)
		{
			return findHighIn(nums, k, low, mid-1);
		}
		
		if(nums[mid]==k)
		{
			if(mid+1<nums.length &&   nums[mid+1]>nums[mid])
			{
				return mid;
			}
			else
			{
				if(mid==high)
				{
					return mid;
				}
				return findHighIn(nums, k, mid+1, high);
			}
		}
		return -1;
	}

	private int findLowIn(int[] nums, int k, int low, int high) {
		// TODO Auto-generated method stub
		int mid = (low+high)/2;
		
		if(nums[mid]>k)
		{
			return findLowIn(nums, k, low, mid-1);
		}
		
		if(nums[mid]<k)
		{
			return findLowIn(nums, k, mid+1, high);
		}
		
		if(nums[mid]==k)
		{
			if(mid-1 >=0 && nums[mid-1]<nums[mid])
			{
				return mid;
			}
			else
			{
				findLowIn(nums, k, low, mid-1);
			}
		}
		return 0;
	}

}
