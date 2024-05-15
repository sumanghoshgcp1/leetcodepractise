import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
    	
    	
    	
    	HashMap<Character,Integer> val= new HashMap<Character, Integer>();
    	
    	
    	val.put('I', 1);
    	val.put('V', 5);
    	val.put('X', 10);
    	val.put('L', 50);
    	val.put('C', 100);
    	val.put('D', 500);
    	val.put('M', 1000);
    	
    	int sum=0;
    	
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		if(i==s.length()-1)
    		{
    			sum+=val.get(s.charAt(i));
    		}
    		else
    		{
    			if(val.get(s.charAt(i))>=val.get(s.charAt(i+1)))
    			{
    				sum+=val.get(s.charAt(i));
    			}
    			else
    			{
    				sum-=val.get(s.charAt(i));
    			}
    		}
    		
    	}
    
    	
    	return sum;
    
    	
        
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	
    	int res= s.romanToInt("III");
    	
    	System.out.println(res);
    			
    }
}