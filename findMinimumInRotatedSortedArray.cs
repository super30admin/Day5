using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class findMinimumInRotatedSortedArray
    {
        /*
         * Need to find the direction of sorted array as minimum number will always be on the unsorted portion
         * T.C : O(log N) 
         * S.C: O(1) Not using any extra space
         */
        public int FindMin(int[] nums)
        {
            //edge condition
            if (nums.Length == 0)
                return 0;

            int low = 0;
            int high = nums.Length - 1;

            while(low<=high)
            {
                if (nums[low] <= nums[high])
                    return nums[low];

                int mid = low + (high - low) / 2;

                if ((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == nums.Length - 1 || nums[mid] < nums[mid + 1]))
                    return nums[mid];

                //array sorted in the left side
                if(nums[low]<nums[mid])
                {
                    low = mid + 1;
                }
                //array sorted in the right side
                else
                {
                    high = mid - 1;
                }
            }

            return 456464;
        }
    }
}
