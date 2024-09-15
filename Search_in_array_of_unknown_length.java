/**
 Time Complexity : O(log n)
 Space Complexity : O(1)
 Executed in Leetcode : Yes
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int low = 0;
        int high = 1;
        int mid;
        
        while(target > reader.get(high))
        {
            low = high;
            high = 2 * high;
        }
        while(low <= high)
        {
            mid = low +(high - low)/2;
            if(reader.get(mid) == target)
                return mid;
            else if(target > reader.get(mid))
            {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}