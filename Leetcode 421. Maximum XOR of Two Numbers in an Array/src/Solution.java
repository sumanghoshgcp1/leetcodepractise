class Solution {
	public static void main(String args[])
	{
		int nums[]= {14,70,53,83,49,91,36,80,92,51,66,70};
		
		Solution s = new Solution();
		
		int res = s.findMaximumXOR(nums);
		
		System.out.println(res);
				
	}
    public int findMaximumXOR(int[] nums) {
        
    	int max=Integer.MIN_VALUE;
    	for(int num  : nums)
    	{
    		if(num>max)
    		{
    			max = num;
    		}
    	}
    	
    	int highest_set_bit=getHighestSetBit(max);
    	
    	
    	Trie root= trieFy(nums,highest_set_bit);
    	
    	int maxXor = Integer.MIN_VALUE;
    	
    	for(int el  : nums)
    	{
    		int el1=getElementFOrXor(el,highest_set_bit,root);
    		
    		if((el ^ el1) >maxXor)
    		{
    			maxXor = el ^ el1;
    			
    		}
    	}
    	
    	return maxXor;
    	
    }

	private int getElementFOrXor(int el, int highest_set_bit,Trie root) {
		
		int returnEl=0;
		Trie  temp =root;
		for(int bit= highest_set_bit;bit>=0;bit--)
		{
			if(!isSet(bit, el))
			{
				if(temp.right!=null &&  temp.right.val==1)
				{
					returnEl= (int) (returnEl+ Math.pow(2, bit));
					temp=temp.right;
				}
				else
				{
					if(temp.left!=null)
					{
						temp=temp.left;
					}
				}
				
				
			}
			else
			{
				
				if(temp.left!=null)
				{
					temp=temp.left;
				}
				else
				{
					if(temp.right!=null && temp.right.val==1)
					{
						returnEl= (int) (returnEl+ Math.pow(2, bit));
						temp=temp.right;
					}
				}
				
			}
			
		}
		return returnEl;
	}

	private Solution.Trie trieFy(int[] nums, int highest_set_bit) {
		
		// lets first create a root 
		
		Trie root = new Trie();
		root.val=-1;
		
		//  now start creating Trie 
		for(int el : nums)
		{
			Trie temp=root;
			  for(int bit=highest_set_bit;bit>=0;bit--)
			  {
				  if(isSet(bit,el))
				  {
					  if(temp.right==null)
					  {
					  Trie right = new Trie();
					  right.val=1;
					  temp.right=right;
					  }
					  temp=temp.right;
					  
				  }
				  else
				  {
					  if(temp.left==null)
					  {
					  Trie  left = new Trie();
					  left.val=0;
					  temp.left=left;
					  }
					  temp = temp.left;
				  }
				  
			  }
		}
		
		
		
		return root;
	}

	private boolean isSet(int bit, int el) {
		// TODO Auto-generated method stub
		if((el>>bit & 1)==1)
			return true;
		return false;
	}

	private int getHighestSetBit(int el) {
		
		int count=0;
		while(el>0)
		{
			count++;
			el=el/2;
			
		}
		
		return count-1;
	}
	
	
	private static class Trie 
	{
		
		int val;
		
		Trie left;
		
		Trie right;
		
		
	}
}