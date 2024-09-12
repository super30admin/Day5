//Time Complexity: O(log n)  n=range(high-low), in worst case it is entire n.
//Space Complexity:O(1)
//Did it successfully run on leetcode: yes

class Solution {
    public int search(ArrayReader reader, int target) {
        int low = 0;
        int high = 1;

        while (target > reader.get(high)) {
            low = high;
            high = high * 2; // doubling the high
            if (reader.get(high) == target) {
                return high;
            }
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (reader.get(mid) == target) {
                return mid;
            } else if (reader.get(mid) < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}