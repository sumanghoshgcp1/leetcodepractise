class Solution {
    public String intToRoman(int num) {
    	
    	StringBuffer romanString= new StringBuffer();
    	
    	while(num>0)
    	{
    		if(num>=1000)
    		{
    			romanString.append("M");
    			num=num-1000;
    		}
    		
    		if(num>=900 && num<1000)
    		{
    			romanString.append("CM");
    			num=num-900;
    		}
    		
    		if(num>=500 && num<900)
    		{
    			romanString.append("D");
    			num=num-500;
    		}
    		
    		if(num>=400 && num<500)
    		{
    			romanString.append("CD");
    			num=num-400;
    		}
    		
    		if(num>=100 && num<400)
    		{
    			romanString.append("C");
    			num=num-100;
    		}
    		
    		if(num>=90 && num<100)
    		{
    			romanString.append("XC");
    			num=num-90;
    		}
    		
    		if(num>=50 && num<90)
    		{
    			romanString.append("L");
    			num=num-50;
    		}
    		
    		if(num>=40 && num<50)
    		{
    			romanString.append("XL");
    			num=num-40;
    		}
    		
    		if(num>=10 && num<40)
    		{
    			romanString.append("X");
    			num=num-10;
    		}
    		
    		if(num>=9 && num<10)
    		{
    			romanString.append("IX");
    			num=num-9;
    			
    		}
    		
    		if(num>=5 && num<9)
    		{
    			romanString.append("V");
    			num=num-5;
    			
    		}
    		
    		if(num>=4 && num<5)
    		{
    			romanString.append("IV");
    			num=num-4;
    			
    		}
    		
    		if(num>=1 && num<4)
    		{
    			romanString.append("I");
    			num=num-1;
    			
    		}
    		
    		
    		
    		
    		
    	}
    	
    	return romanString.toString();
        
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	
    	String res= s.intToRoman(3749);
    	
    	System.out.println(res);
    }
}