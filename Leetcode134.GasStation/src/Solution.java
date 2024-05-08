class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	
    	for(int i=0;i<gas.length;i++)
    	{
    		gas[i]=gas[i]-cost[i];
    	}
    	
    	int index=0;
    	int sum=0;
    	int total=0;
    	for(int i=0;i<gas.length;i++)
    	{
    		sum+=gas[i];
    		if(sum<0)
    		{
    			index=i+1;
    			total+=sum;
    			sum=0;
    		}
    	}
    	total+=sum;
    	
    	return  total>=0?index:-1;
        
    }

	
    
}