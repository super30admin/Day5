// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dictionary=dict()
        t=s.split(" ")

        if len(pattern) !=len(t):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in dictionary:
                if t[i] in dictionary.values():
                    return False
                dictionary[pattern[i]]=t[i]
            elif dictionary[pattern[i]]!=t[i]:
                return False
        return True
        
