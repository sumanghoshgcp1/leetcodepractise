class Solution {
    public void rotate(int[] nums, int k) {
        
     int last=nums.length-1;
     
     if(k>=nums.length)
     {
    	 k=k%nums.length;
     }
     
   
     reverse(0,last,nums);
     reverse(0,k-1,nums);
    
     reverse(k,last,nums);
        
     
        
        
     
        
        
        
        
        
        
    }
    
    
    void reverse(int start_index, int end_index,int arr[])
    {
    	if ((start_index>=0 && start_index<arr.length)&&(end_index>=0 && end_index<arr.length))
    	{
        int i=start_index;
        int j= end_index;
        
        while(i<=j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            
            i++;
            j--;
            
        }
        
        
    	}
        
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	int nums[] = {1,2,3};
    	s.rotate(nums, 4);
    	System.out.println(nums);
    }
}