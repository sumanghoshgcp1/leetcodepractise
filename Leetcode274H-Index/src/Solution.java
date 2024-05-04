import java.util.Arrays;


/**
 *   1 2 3 4 4 5
 *   0 1 2 3 4 5
 *   
 *   Certainly! Let's break down the algorithm step by step:

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
 *   
 *   
 */
public class Solution {
	
	 public int hIndex(int[] citations) {
		 
		
		 
		 Arrays.sort(citations);
		 
		 
		 int maxcitation=Integer.MIN_VALUE;
		 
		 
		 for(int i=0;i<citations.length;i++)
		 {
			 int current_cit=citations[i];
			 
			 int no_of_citation= citations.length-i;
			 if(no_of_citation>=current_cit)
			 {
				 if(current_cit>maxcitation)
				 {
					 maxcitation=current_cit;
				 }
			 }
			 else
			 {
				 if(no_of_citation>maxcitation)
				 {
					 maxcitation=no_of_citation;
				 }
			 }
		 }
		 
		 return maxcitation;
	        
	    }
	 
	 public static void main(String args[])
	 {
		 
		 int citations[]= {100};
		 Solution  s = new Solution();
		 
		 int res=s.hIndex(citations);
		 System.out.println(res);
		 
	 }

}
