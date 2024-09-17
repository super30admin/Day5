#Leetcode Problem: 560

class Solution:
    def subarraySum(self, nums, k):
        d={0:1}
        rsum=0
        count=0
        for i in nums:
            rsum+=i
            if rsum-k in d:
                count+=d[rsum-k]
            if rsum in d:
                d[rsum]+=1
            else:
                d[rsum]=1
        return count

#TC: O(n)
#SC: O(n)