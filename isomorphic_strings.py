# Time Complexity: O(N) + O(NlogN)
# Spcae Complexity: O(N)

# The code ran on leetcode
# Problems: Faced problems to interpret what question wanted to say

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1, d2 = {}, {}
        for i, val in enumerate(s):
            if val in d1:
                d1[val].append(i)
            else:
                d1[val] = [i]
            
        for i, val in enumerate(s):
            if val in d2:
                d2[val].append(i)
            else:
                d2[val] = [i]
        
        ans1 = sorted(d1.values())
        ans2 = sorted(d2.values())
        #print(ans1)
        return ans1==ans2
        