122. Best Time to Buy and Sell Stock II
Medium

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.



7,1,5,3,6,4  
0 1 2 3 4 5 



Here’s a more detailed explanation using an example:

Suppose the prices array is [1, 2, 3, 4, 5].
On day 1, the price is 1. You don’t have any stock, so you buy.
On day 2, the price is 2. The price has increased, so you sell the stock bought on day 1 and buy again at 2.
On day 3, the price is 3. Again, the price has increased, so you sell the stock bought on day 2 and buy again at 3.
This process continues until the last day.
By following this strategy, you make a profit of 1 on each day (2-1, 3-2, 4-3, 5-4), which adds up to 4. This is the maximum profit you can achieve with the given prices, and the greedy algorithm ensures you capture it.