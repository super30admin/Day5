// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictionary=dict()
        for i in range(len(s)):
            if s[i] not in dictionary:
                if t[i] in dictionary.values():
                    return False
                dictionary[s[i]]=t[i]
            elif dictionary[s[i]]!=t[i]:
                return False
        return True
