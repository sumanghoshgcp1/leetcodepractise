class Solution {
    public String reverseWords(String s) {
		
    	String arr[]=s.split(" ");
    	
    	StringBuffer buff=new StringBuffer();
    	
    	for(int i=arr.length-1;i>=0;i--)
    	{
    		if(!arr[i].isEmpty() && arr[i]!="")
    		{
    		if(i>0)
    		{
    			buff.append(arr[i]);
    			buff.append(" ");
    			
    		}
    		else
    		{
    			buff.append(arr[i]);
    			
    			
    		}
    		}
    		
    	}
    	
    	return buff.toString().trim();
        
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	
    	String res= s.reverseWords("  hello world  ");
    	
    	System.out.println(res);
    }
}