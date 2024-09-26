// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/*
Problem 14
Provide an array of n-1 integers in the range of 1 to n with no duplicates in list, One of the integers is missing in the list. Write a code to find the missing integer.

 */
public class MissingInteger {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size*(size+1)/2;
        for(int i=0; i<nums.length;i++)
        {
            sum = sum -nums[i];
        }
        return sum;
    }
}
