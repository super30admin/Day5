##Time Complexity : O(n)
##Space Complexity : O(1)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = str.split()
        if len(words) != len(pattern):
            return False
        d = {}
        for x in range(len(words)):
            if pattern[x] not in d:
                if words[x] in d.values():
                    return False
                d[pattern[x]] = words[x]
            else:
                if d[pattern[x]] != words[x]:
                    return False
        return True
                    
        
        