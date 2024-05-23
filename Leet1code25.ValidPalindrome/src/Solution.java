class Solution {
    public boolean isPalindrome(String s) {
    	
    	int left=0;
    	
    	int right=s.length()-1;
    	
    	while(left<right)
    	{
    		char leftchar=s.charAt(left);
    		char rightchar=s.charAt(right);
    		
    		if(!Character.isLetterOrDigit(leftchar) )
    			left++;
    		if(!Character.isLetterOrDigit(rightchar)  )
    			right--;
    		
    		if(Character.isLetterOrDigit(leftchar) && Character.isLetterOrDigit(rightchar))
    		{
    		if(Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar))
    		{
    			return false;
    		}
    		else
    		{
    			left++;
    			right--;
    		}
    		}
    	}
    	return true;
        
    }
    
    public static void main(String args[])
    {
    	
    	System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama "));
    	
    }
}