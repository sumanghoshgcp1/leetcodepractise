import java.util.Objects;

class Solution {
    public int trap(int[] height) {
    	
    	int leftmax=Integer.MIN_VALUE;
    	int rightmax=Integer.MIN_VALUE;
    	
    	
    	int leftmaxarr[]= new int[height.length];
    	
    	int rightmaxarr[]= new int[height.length];
    	
    	
    	for(int i=0;i<height.length;i++)
    	{
    		if(height[i]>leftmax)
    		{
    			leftmax=height[i];
    			leftmaxarr[i]=leftmax;
    		}
    		else
    		{
    			leftmaxarr[i]=leftmax;
    		}
    		
    		
    		if(height[height.length-1-i]>rightmax)
    		{
    			rightmax=height[height.length-1-i];
    			rightmaxarr[height.length-1-i]=rightmax;
    		}
    		else
    		{
    			rightmaxarr[height.length-1-i]=rightmax;
    		}
    		
    		
    	}
    	
    	
    	///
    	
    	int totalWaterArea=0;
    	
    	for(int i=0;i<height.length;i++)
    	{
    		
    		int min_height=min(leftmaxarr[i],rightmaxarr[i]);
    		
    		totalWaterArea+=min_height-height[i]>=0?min_height-height[i]:0;
    		
    	}
    	
    	return totalWaterArea;
    	
    	
    	
    	
    	
    	
    	
    }

	private int min(int i, int j) {
		// TODO Auto-generated method stub
		if(i<=j)
			return i;
		else
			return j;
		
	}
	
	public static void main(String args[])
	{
		Solution s = new Solution();
		
		int height[]= {4,2,3};
		
		int area=s.trap(height);
		System.out.println(area);
	}
}
    
	
	
	
	
	
