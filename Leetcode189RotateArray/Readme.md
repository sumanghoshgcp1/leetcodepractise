# LeetCode Solutions

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.


this is one example - 

[1,2,3,4,5,6,7], k = 3

this is final output result-

[5,6,7,1,2,3,4]


if I reverse the whole array = [ 7 ,6 ,5, 4 ,3 ,2,1]

if you see now we need to reverse two parts of array  7,6,5  and 4,3,2,1 - these two parts of array and we will get the result.

[-1,-100,3,99]
2

result - 
[3,99,-1,-100]

reverse whole array - 

99 3 -100 -1

k=2 



corner case when k is larger than array length - 


[ 1,2,3,4,5,6,7]

k>=len - >   k=k%len