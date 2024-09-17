/**
 * Time Complexity - O(logn) - Binary Search
 * Space Complexity - O(1)
 * yes this code ran on leetcode
 * Critical point was where to go on either side of mid element
 */

class Solution {
    public int findPeakElement(int[] nums) {

        int l=0, r = nums.length-1;

        while(l<r){
            int mid = (l+r)>>1;
            if(nums[mid] < nums[mid+1]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return l;
    }
}