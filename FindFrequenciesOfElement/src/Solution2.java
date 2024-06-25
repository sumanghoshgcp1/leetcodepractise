import java.util.Arrays;

/**
 * find the frequencies of element 
 * 
 * this solution is using frequency array 
 */
public class Solution2 {
	
	public static void main(String args[])
	{
		int nums[]= {1,5,2,1,5,7,2,5,7};
		
		Solution2 s = new Solution2();
		
		int  freq= s.findFreq(nums, 5);
		
		System.out.println(freq);
	}
	
	
	int findFreq(int nums[],int k)
	{
		int freqArray[]= new int[100];
		
		for(int i=0;i<nums.length;i++)
		{
			freqArray[nums[i]]++;
		}
		
		return freqArray[k];
		
	}

	

}
