class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        running_sum_index = {0:-1}
        running_sum=0
        max_length = 0
        for i, num in enumerate(nums):
            running_sum+=1 if num==1 else -1
            if running_sum in running_sum_index:
                max_length = max(max_length, i-running_sum_index[running_sum])
            else:
                running_sum_index[running_sum]=i
        return max_length

        