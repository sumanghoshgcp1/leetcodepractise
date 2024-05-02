/*
 * 
 * 
 * Empty Prices Array:
Input: prices = []
Expected Output: 0 (No transactions possible)
Single Price:
Input: prices = [5]
Expected Output: 0 (No transactions possible)
Prices Decreasing Continuously:
Input: prices = [7, 6, 5, 4, 3]
Expected Output: 0 (No way to make a profit)
Prices Increasing Continuously:
Input: prices = [1, 2, 3, 4, 5]
Expected Output: 4 (Buy on day 1, sell on day 5)
Alternating Prices:
Input: prices = [7, 1, 5, 3, 6, 4]
Expected Output: 7 (Buy on day 2, sell on day 3; buy on day 4, sell on day 5)
Prices with Plateaus:
Input: prices = [1, 1, 1, 1, 1]
Expected Output: 0 (No way to make a profit)
Random Prices:
Input: prices = [3, 2, 4, 1, 5, 6]
Expected Output: 7 (Buy on day 2, sell on day 3; buy on day 4, sell on day 6)
Large Prices Array:
Input: prices = [10, 20, 30, ..., 1000] (1000 elements with increments of 10)
Expected Output: 49500 (Sum of differences between consecutive prices)
Remember to test additional cases as well to ensure your solution handles all scenarios correctly! 😊




What if the prices array contains negative values?
How do I handle overflow or large input sizes in my solution?
Can you explain how to write test cases effectively for competitive programming problems?

Response stopped

New topic

 */
public class Solution {

public int maxProfit(int[] prices) {
	
	int maxProfit=0;
	
	for(int i=1;i<prices.length;i++)
        
	{
		
		if(prices[i]>prices[i-1])
		{
			maxProfit+=prices[i]-prices[i-1];
		}
		
	}
	
	return maxProfit;
    }

  public static void main(String args[])
  {
	  int prices[]= {3, 2, 4, 1, 5, 6};
	  
	  Solution s = new Solution();
	  
	  int maxprofit = s.maxProfit(prices);
	  System.out.println(maxprofit);
  }
}
