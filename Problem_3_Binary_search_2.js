// Time Complexity : O(log(n))
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Problem 3: (https://leetcode.com/problems/find-peak-element/)

/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function (nums) {
    if (nums === null)
        return 0;
    let low = 0;
    let high = nums.length - 1;
    while (low <= high) {
        let mid = Math.floor(low + ((high - low) / 2));
        // If the mid is higher than its neighbors, return the index
        if ((mid === low || nums[mid - 1] < nums[mid]) && (mid === high || nums[mid + 1] < nums[mid])) {
            return mid;
        }
        // If the number of right is higher, search the right half
        if (nums[mid + 1] > nums[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
};