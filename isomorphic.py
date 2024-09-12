# Time Complexity : O(N) 
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict = {}
        hset = []
        if len(s)!=len(t): return False
        for i in range(len(s)):
            if s[i] in dict:
                if t[i] != dict[s[i]]:
                    return False
            else:
                if t[i] in hset:
                    return False
                else:
                    dict[s[i]]=t[i]
                    hset.append(t[i])
        return True
        