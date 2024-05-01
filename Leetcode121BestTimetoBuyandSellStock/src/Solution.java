/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

give some more test cases and answer


Certainly! Here are a few more test cases for the stock price challenge:

**Test Case 1:**
- Input: `prices = [2, 4, 1, 7]`
- Output: `6`
- Explanation: Buy on day 1 (price = 2) and sell on day 4 (price = 7), profit = 7-2 = 5.

**Test Case 2:**
- Input: `prices = [8, 5, 3, 1]`
- Output: `0`
- Explanation: Prices are in descending order, so no profit can be made.

**Test Case 3:**
- Input: `prices = [3, 8, 5, 10, 7, 20]`
- Output: `17`
- Explanation: Buy on day 1 (price = 3) and sell on day 6 (price = 20), profit = 20-3 = 17.

**Test Case 4:**
- Input: `prices = [1, 2, 3, 4, 5, 6]`
- Output: `5`
- Explanation: Prices are in ascending order, so buy on day 1 (price = 1) and sell on the last day (price = 6), profit = 6-1 = 5.

**Test Case 5:**
- Input: `prices = [10, 10, 10, 10, 10]`
- Output: `0`
- Explanation: All prices are the same, so no profit can be made.

These test cases cover a variety of scenarios, including increasing and decreasing price trends, as well as fluctuating prices. The goal is to find the maximum difference between the lowest and highest prices, but only if the low price comes before the high price. If no such scenario exists, the profit is 0. Remember, you must buy before you can sell.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profiit=Integer.MIN_VALUE;
        
       for(int i=0;i<prices.length;i++)
       {
    	   if(prices[i]<min)
    		   min=prices[i];
    	   
    	   int tempprofit=prices[i]-min;
    	   
    	   if(tempprofit>profiit)
    		   profiit=tempprofit;
    	   
    	   
    	  
    	   
    	   
       }
       
       return profiit;
    }
}