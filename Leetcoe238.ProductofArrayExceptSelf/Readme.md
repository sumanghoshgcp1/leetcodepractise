238. Product of Array Except Self
Medium

22174

1368

Add to List

Share
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.



SOlution Intuition - 

----------------------------

Count of Zeros is important - 

if there is no zero it is very simple - 

just need to find cummulative mul and then nums[i] = mul /nums[i]

but when array contains zero the game is different - 

say there is only one zero then other non zero element the result is 0 but that zero th element the result  is multipication of other non zero element 

but when there is more that one zero then result for each element it is always zero 



