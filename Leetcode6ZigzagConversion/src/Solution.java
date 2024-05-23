import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
       
    	int zig=numRows;
    	int zag=zig-2;
    	
    	List<String> ls=split(s,zig,zag);
    	System.out.println(ls);
    	
    	int size=ls.size();
    	int row=-1;
    	boolean isDown=true;
    	
    	String storemat[][]=new String[numRows][size];
    	int counter=1;
    	for (int col=0;col<size;col++)
    	{
    		String colString=ls.get(col);
    		
    		String colStringArr[]=colString.split("");
    		
    		
    			
    		
    		if(isDown)
    		{
    			for(String colel : colStringArr)
    			{
    				storemat[++row][col]=colel;
    				isDown=false;
    			}
    		}
    		else
    		{
    			for(String colel : colStringArr)
    			{
    				storemat[row-1>=0?--row:0][col]=colel;
    				
    			}
    			
    			if(counter==zag || zag==0)
    			{
    				isDown=true;
    				counter=1;
    				row=-1;
    				
    			}
    			else
    			{
    			
    			
    			counter++;
    			}
    			
    		}
    		
    	}
    	
    	StringBuffer buff = new StringBuffer();
    	for(int i=0;i<numRows;i++)
    	{
    		for(int j=0;j<size;j++)
    		{
    			String s1= storemat[i][j];
    			
    			if(s1!=null && !s1.isEmpty())
    			{
    				buff.append(s1);
    			}
    		}
    	}
    	
    	
    	
    	System.out.println(buff.toString());
    	
    	return buff.toString();
    }
    
    private List<String> split(String s, int zig, int zag) {
		// TODO Auto-generated method stub
    	
    	List<String> finalList= new ArrayList<String>();
    	int i=0;
    	boolean isZig=true;
    	while(i<s.length())
    	{
    		if(isZig)
    		{
    			
    			String temp1=s.substring(i, i+zig<s.length()?i+zig:s.length());
    			finalList.add(temp1);
    			i=i+zig;
    			isZig=false;
    		}
    		else
    		{
    			if(zag<0)
    				zag=0;
    			String temp2=s.substring(i, i+zag<s.length()?i+zag:s.length());
    			
    			 String arr[]=temp2.split("");
    			 
    			 for(String temp3 : arr)
    			 {
    				 finalList.add(temp3);
    			 }
    			 
    			 i=i+zag;
    			 isZig=true;
    			 
    			
    		}
    		
    	}
		return finalList;
	}

	public static void main(String args[])
    {
    	Solution s = new Solution();
    	s.convert("AB", 1);
    	
    }
}