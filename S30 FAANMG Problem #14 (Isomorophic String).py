# time complexity = O(n)
# space Complexity = O(N)
# All test cases passed in Leetcode

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        
        def helper(word):
            lookup = {}
            output = []
            count = 1
            for n in word:
                if n not in lookup:
                    lookup[n]= count
                    count+=1
                output.append(lookup[n])
            return output
        
        return helper(s)==helper(t)
