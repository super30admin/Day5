public class LeetCode153 {

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // to prevent interger range overflow
            if ((nums[low] < nums[high])) {// this is the case when rotation is equal to length of array and the array
                                           // is completely sorted again
                return nums[low];
            }
            if ((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == n - 1 || nums[mid] < nums[mid + 1])) {// this is to
                                                                                                         // handle the
                                                                                                         // case when
                                                                                                         // array=[1,2]
                                                                                                         // and [2,1]
                return nums[mid];
            } else if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}


//TC--> O(log n)
//sc-->O(1)