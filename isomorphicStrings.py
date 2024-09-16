# Time Complexity : O(N)
# Space Complexity : O(N) N = length of string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        """
        BOTH STRINGS ARE THE SAME LENGTH
        initial approach:
            - tried comparing frequencies of the letters to each other
        Did basically exact same thing as in wordPattern. 
        - store one letter to another in the other string. Store the opposite string's letter to another in the other string
        If the mapping is not what it initially was, return False
        """
        sDict = defaultdict(list)
        tDict = defaultdict(list)
        
        for i in range(len(s)):
            if s[i] not in sDict:
                sDict[s[i]] = t[i]
            else:
                if sDict[s[i]] != t[i]:
                    return False
        
        for i in range(len(t)):
            if t[i] not in tDict:
                tDict[t[i]] = s[i]
            else:
                if tDict[t[i]] != s[i]:
                    return False
        
        return True