import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	
	public static void main(String args[])
	{
		Solution s = new Solution();
		
		int nums[] = {1,2,3,2,1,2,3,2,1};
		
		int res[]=s.findPairIndex(nums);
		Arrays.stream(res).forEach(el -> System.out.println(el));
	}
	
	int [] findPairIndex(int nums[])
	{
		
		HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
		
		int minDiff = Integer.MAX_VALUE;
		int leftIndex=-1;
		int rightIndex=-1;
		
		int retarr[] = new int[2];
		for(int i=0;i<nums.length;i++)
		{
			if(indexMap.containsKey(nums[i]))
			{
				
				int previoudIndex=indexMap.get(nums[i]);
				
				int diff=i-previoudIndex;
				
				if(diff<minDiff)
				{ 
					minDiff=diff;
					leftIndex=previoudIndex;
					rightIndex=i;
				}
				
				indexMap.put(nums[i], i);
				
			}
			else
			{
				indexMap.put(nums[i], i);
			}
		}
		
		retarr[0]=leftIndex;
		retarr[1]=rightIndex;
		
		return retarr;
		
	}

}
