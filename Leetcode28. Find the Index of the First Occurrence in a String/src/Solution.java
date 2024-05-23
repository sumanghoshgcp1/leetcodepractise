class Solution {
    public int strStr(String haystack, String needle) {
    	
    	int len=needle.length();
    	
    	for(int i=0;i<haystack.length();i++)
    	{
    		
    		String tempString=haystack.substring(i, i+len<haystack.length()?i+len:haystack.length());
    		if(tempString.equals(needle))
    			return i;
    	}
    	return -1;
    	
    	
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	
    	int index=s.strStr("leetcode", "leeto");
    	System.out.println(index);
    }
}