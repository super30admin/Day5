class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        running_sum = 0
        count = 0
        prefix_sums = {0: 1}  # Dictionary to store frequency of prefix sums
        
        for num in nums:
            running_sum += num
            target = running_sum - k
            if target in prefix_sums:
                count += prefix_sums[target]
            if running_sum in prefix_sums:
                prefix_sums[running_sum] += 1
            else:
                prefix_sums[running_sum] = 1
        
        return count
