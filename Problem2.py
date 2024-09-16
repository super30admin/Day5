# Time Complexity: O(N)
# Space Complexity: O(N)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic = {}
        if len(set(s)) != len(set(t)):          # If length of unique characters of both inputs do not match return false
            return False
        for i in range(len(s)):
            if s[i] not in dic:                 
                dic[s[i]] = t[i]                # Create a key value pair of s and t
            else:
                if dic[s[i]] != t[i]:           # If key already exists, check if the value is same as t, if not return False
                    return False
        return True
