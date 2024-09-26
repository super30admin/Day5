# Time Complexity : O(N)
# Space Complexity : O(N) -> for the words list
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

class Solution:
    '''Same as Isomorphic String'''
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        
        if len(words) != len(pattern):
            return False
        
        d = {} 
        for i in range(len(pattern)):
            if pattern[i] in d:
                #check if mapping is correct
                if d[pattern[i]] != words[i]:
                    return False
            else:
                #establish mapping
                if words[i] in d.values():
                    return False
                else:
                    d[pattern[i]] = words[i]
        
        return True