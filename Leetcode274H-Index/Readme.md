Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

 

Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,3,1]
Output: 1

Possible Solution 


Certainly! Let's break down the algorithm step by step:

1. **Sorting the Citations**:
   - The `citations` array is sorted in ascending order using `Arrays.sort(citations)`.
   - This step ensures that the citation counts are arranged from lowest to highest.

2. **Iterating Through the Sorted Array**:
   - A loop iterates through the sorted `citations` array.
   - For each citation count, the following steps are performed:

3. **Calculating Remaining Citations**:
   - The variable `no_of_citation` represents the number of remaining citations (i.e., the number of elements in the array after the current position).
   - It is calculated as `citations.length - i`.

4. **Comparing Current Citation and Remaining Citations**:
   - If `no_of_citation` is greater than or equal to the current citation count (`current_cit`), it means that there are enough remaining citations to satisfy the h-index condition.
   - In this case:
     - If `current_cit` is greater than the current `maxcitation`, update `maxcitation` with `current_cit`.
   - Otherwise (when `no_of_citation` is less than `current_cit`):
     - If `no_of_citation` is greater than the current `maxcitation`, update `maxcitation` with `no_of_citation`.

5. **Final Result**:
   - After iterating through all citations, the `maxcitation` holds the maximum h-index value.
   - Return `maxcitation` as the result of the `hIndex` method.

The algorithm aims to find the h-index, which represents the maximum value `h` such that there are at least `h` papers with `h` or more citations. The provided code efficiently computes this value based on the sorted citation counts. Well done! 😊👍

