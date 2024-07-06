import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	
	public static void main(String args[])
	{
		Solution s = new Solution();
		String words[]= {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
		int maxWidth=20;
		
		List<String> res = s.fullJustify(words, maxWidth);
		System.out.println(res);
	}
    public List<String> fullJustify(String[] words, int maxWidth) {
    	List<String> lines = new ArrayList<String>();
    	
    	Queue<IndexToLength> IndexStorage= new LinkedList<IndexToLength>();
    	
    	int len=-1;
    	int sum=0;
    	
        int counter=0;
    	for(int i=0;i<words.length;i++)
    	{
    		sum=sum+words[i].length();
    		len++;
    		counter++;
    		
    		if(sum+len>=maxWidth)
    		{
    			IndexToLength indexLen= new IndexToLength();
    			indexLen.index=i-1;
    			indexLen.length=sum-words[i].length();
    			indexLen.count=counter-1;
    			IndexStorage.add(indexLen);
    			len=0;
    			sum=words[i].length();
    			counter=1;
    		}
    		
    		if(i==words.length-1)
    		{
    			IndexToLength indexLen1= new IndexToLength();
    			
    			indexLen1.index=words.length-1;
    			indexLen1.length=sum;
    			indexLen1.count=counter;
    			IndexStorage.add(indexLen1);
    		}
    		
    		
    		
    	}
    	
    	
    	
    	int startIndex=0;
    	int endIndex=-1;
    	
    	while(!IndexStorage.isEmpty())
    	{
    		IndexToLength currentIndexToLength=IndexStorage.poll();
    		endIndex=currentIndexToLength.index;
    		int currentCount=currentIndexToLength.count;
    		int currentLen=currentIndexToLength.length;
    		if(IndexStorage.isEmpty())
    		{
    			//lastline
    			
    			StringBuffer tempBuffString = new StringBuffer();
    			
    			for(int j=startIndex;j<=endIndex;j++)
    			{
    				if(j==startIndex)
    				{
    					tempBuffString.append(words[j]);
    				}
    				else
    				{
    					tempBuffString.append(" ");
    					tempBuffString.append(words[j]);
    				}
    			}
    			
    			if(tempBuffString.toString().length()<maxWidth)
    			{
    				int spaceToAdd=maxWidth-tempBuffString.toString().length();
    				
    				int sc=0;
					while(sc<spaceToAdd)
					{
						tempBuffString.append(" ");
						
						sc++;
					}
    				
    			}
    			
    			lines.add(tempBuffString.toString());
    		}
    		else
    		{
    			int spacesToAppend=maxWidth-currentLen;
    			
    			int spacedelim=currentCount>1?  spacesToAppend/(currentCount-1):spacesToAppend;
    			int extraSpace=currentCount>1? spacesToAppend%(currentCount-1) : 0;
    			StringBuffer tempBuff = new StringBuffer();
    			
    			for(int k=startIndex;k<=endIndex;k++)
    			{
    				if(k==startIndex)
    				{
    					tempBuff.append(words[k]);
    					int ss=0;
    					while(ss<extraSpace)
    					{
    						tempBuff.append(" ");
    						
    						ss++;
    					}
    					
    					if(startIndex==endIndex)
    					{
    						int sc=0;
        					while(sc<spacedelim)
        					{
        						tempBuff.append(" ");
        						
        						sc++;
        					}
    					}
    					
    					
    				}
    				else
    				{
    					int sc=0;
    					while(sc<spacedelim)
    					{
    						tempBuff.append(" ");
    						
    						sc++;
    					}
    					
    					tempBuff.append(words[k]);
    					
    				}
    			}
    			
    			lines.add(tempBuff.toString());
    			
    		}
    		
    		startIndex=endIndex+1;
    		
    	}
    	
    	return lines;
    }
    
    
}

class IndexToLength
{
	int index;
	int length;
	int count;
}