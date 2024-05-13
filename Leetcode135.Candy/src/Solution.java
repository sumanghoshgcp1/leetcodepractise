class Solution {
    public int candy(int[] ratings) {
    	
    	int candies[] = new int[ratings.length];
    	
    	populateCandies(candies,ratings,0);
    	
    	int sum=0;
    	for(int can : candies)
    	{
    		sum+=can;
    	}
    	
    	return sum;
        
    }

	private void populateCandies(int[] candies, int[] ratings, int i) {
		
		if(i==ratings.length)
			return;
		
		if(i<ratings.length   &&  candies[i]==0)
		{
			int left=0;
			int right=0;
			
			if(i>0 && ratings[i]>ratings[i-1])
			{
				left=candies[i-1];
			}
			
			if(i<ratings.length-1 && ratings[i]>ratings[i+1])
			{
				populateCandies(candies, ratings, i+1);
				right=candies[i+1];
			}
			
			if(left>=right)
			{
				candies[i]=left+1;
			}
			else
			{
				candies[i]=right+1;
			}
				
			
			
		}
		
		populateCandies(candies, ratings, i+1);
		
	}
	
	public static void main(String args[])
	{
		int ratings[] = {1,6,7,9,5,3,2};
		
		Solution s = new Solution();
		
		int res=s.candy(ratings);
		
		System.out.println(res);
	}
}