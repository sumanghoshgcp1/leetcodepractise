134. Gas Station
Medium

11752

1108

Add to List

Share
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique

 

Example 1:

Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation:
Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
Therefore, return 3 as the starting index.
Example 2:

Input: gas = [2,3,4], cost = [3,4,3]
Output: -1
Explanation:
You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 0. Your tank = 4 - 3 + 2 = 3
Travel to station 1. Your tank = 3 - 3 + 3 = 3
You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
Therefore, you can't travel around the circuit once no matter where you start.
 

Constraints:

n == gas.length == cost.length
1 <= n <= 105
0 <= gas[i], cost[i] <= 104




Certainly! Let's explore a few more test cases for the "Gas Station" problem.

1. **Example 3**:
   - Input: `gas = [5, 2, 10, 8, 6], cost = [3, 4, 5, 1, 2]`
   - Output: 2
   - Explanation: Starting at station 2 (index 2), we can fill up with 10 units of gas. Our tank becomes 0 + 10 = 10. Then we travel to station 3 (index 3), where the cost is 1. Our tank becomes 10 - 1 = 9. We continue to station 4 (index 4) with a cost of 2, leaving us with 9 - 2 = 7 units of gas. Finally, we return to station 0 (index 0) with a cost of 3, and our tank becomes 7 - 3 = 4. We have enough gas to complete the circuit, so the starting index is 2.

2. **Example 4**:
   - Input: `gas = [3, 4, 5], cost = [5, 3, 4]`
   - Output: 1
   - Explanation: Starting at station 1 (index 1), we can fill up with 4 units of gas. Our tank becomes 0 + 4 = 4. Then we travel to station 2 (index 2), where the cost is 4. Our tank becomes 4 - 4 = 0. Unfortunately, we cannot continue to the next station, so we return -1.

3. **Example 5**:
   - Input: `gas = [1, 1, 1, 1], cost = [1, 1, 1, 1]`
   - Output: 0
   - Explanation: Any station can be the starting point, as the gas and cost are equal. We can complete the circuit by going from station 0 to station 1, then to station 2, and finally back to station 3.

Remember that the solution is guaranteed to be unique, so there will always be only one valid starting index. If no valid starting index exists, the function should return -1. Let me know if you'd like to explore more examples! 😊¹²³

Source: Conversation with Bing, 8/5/2024
(1) 134. Gas Station - LeetCode Solutions. https://walkccc.me/LeetCode/problems/134/.
(2) Leetcode.com problem 134: "Gas Station" - University of Tennessee. https://web.eecs.utk.edu/~jplank/topcoder-writeups/Leetcode/GasStation/index.html.
(3) Gas Station — LeetCode 134. Solving the problem where you ... - Medium. https://medium.com/@rohitsharmacr/gas-station-leetcode-134-d9693244d18c.



Your code is a valid implementation of the **Gas Station** problem, and it follows the greedy approach to find the starting station. Let's break down how your code works:

1. **Initialization**:
   - You start by calculating the difference between `gas[i]` and `cost[i]` for each station and store it back in the `gas` array. This represents the net gas available at each station after accounting for the cost of travel.

2. **Finding the Starting Index**:
   - You then iterate through the `gas` array, maintaining two variables:
     - `sum`: Represents the net gas available as you move from station to station.
     - `index`: Represents the potential starting index.
   - If `sum` becomes negative (i.e., you can't continue from the current station), you update the `index` to the next station and reset `sum` to zero.
   - This way, you keep track of the potential starting index while considering the net gas available.

3. **Final Calculation**:
   - After the loop, you calculate the `total` net gas by adding up all the `gas[i] - cost[i]` values.
   - If the `total` is non-negative, you return the `index` as the starting station; otherwise, you return `-1`.

4. **Complexity Analysis**:
   - Your approach has an **O(n)** time complexity because you iterate through the `gas` array only once.
   - It also uses **constant space** since you update the variables in-place without using extra data structures.

Overall, your code looks correct, and you've implemented the core logic of the problem. Well done! If you have any further questions or need additional assistance, feel free to ask! 🚗🛢️

---
I've provided feedback on your code and highlighted its key points. If you'd like me to explore alternative approaches or discuss any specific part, feel free to ask!