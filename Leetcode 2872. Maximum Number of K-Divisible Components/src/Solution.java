import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Solution {

	public static void main(String arg[])
	{
		Solution s = new Solution();
		
		int n = 5; 
		int[][] edges = {{0,2},{1,2},{1,3},{2,4}};
		int[] values = {1,8,1,4,4};
		int  k = 6;
		
		int count=s.maxKDivisibleComponents(n, edges, values, k);
		
		System.out.println(count);
				
	}

	
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
    	
    	long [] longvalues=convertToLong(values);
    	Map<Integer,List<Integer>>nodetoNodeMap=treeify(n,edges);
        
    	Queue<Integer> leafNodesQueue=FindLeafNOdes(nodetoNodeMap);
    	
    	int count=1;
    	while(!leafNodesQueue.isEmpty())
    	{
    		Integer key=leafNodesQueue.poll();
    		
    		if(nodetoNodeMap.get(key).size()>=1)
    		{
    		int parent=nodetoNodeMap.get(key).get(0);
    		
    		nodetoNodeMap.get(parent).remove(new Integer(key));
    		
    		if(nodetoNodeMap.get(parent).size()<=1)
    		{
    			leafNodesQueue.add(parent);
    		}
    		
    		if(longvalues[key]%k!=0)
    		{
    			longvalues[parent]=longvalues[parent]+longvalues[key];
    		}
    		else
    		{
    			count++;
    		}
    	}
    		
    		
    	}
    	
    	return count;
    }
    
    private long[] convertToLong(int[] values) {
		// TODO Auto-generated method stub
    	long val[] = new long[values.length];
    	for(int i=0;i<values.length;i++)
    	{
    		val[i]=values[i];
    	}
		return val;
	}


	private Map<Integer, List<Integer>> treeify(int n, int[][] edges) {
		// TODO Auto-generated method stub
		
		Map<Integer,List<Integer>> nodetoNodeMap = new HashMap<Integer, List<Integer>>();
		
		for(int i=0;i<n;i++)
		{
			nodetoNodeMap.put(i, new ArrayList<Integer>());
		}
		
		for(int edge[] : edges)
		{
			int a =edge[0];
			int b = edge[1];
			nodetoNodeMap.get(a).add(b);
			nodetoNodeMap.get(b).add(a);
		}
		return nodetoNodeMap;
	}
    
    
private Queue<Integer> FindLeafNOdes(Map<Integer, List<Integer>> nodetoNodeMap) {
		
	Queue<Integer> setOfLeafNodes= new LinkedList<Integer>();
		
		nodetoNodeMap.keySet().forEach( key -> {
			
			if(nodetoNodeMap.get(key).size()<=1)
			{
				setOfLeafNodes.add(key);
			}
		});
		return setOfLeafNodes;
	}
}