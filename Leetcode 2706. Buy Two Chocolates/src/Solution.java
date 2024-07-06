import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
    	
    	Arrays.sort(prices);
    	
    	int minCost=prices[0]+prices[1];
    	
    	return minCost<=money?money-minCost:money;
        
    }
}