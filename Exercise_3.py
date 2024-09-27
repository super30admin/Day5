# Time Complexity: O(m) -> m is the length of s 
# Space Complexity: O(1) -> space taken by hashmap or hashset is of fixed length 26 -> which is constant.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s = s.split(" ")
        
        if len(pattern)!=len(s):
            return False
        
        hashmap = {}
        hashset = set()
        
        for i in range(len(pattern)):
            if pattern[i] in hashmap:
                if hashmap[pattern[i]]!=s[i]:
                    return False
            else:
                if s[i] in hashset:
                    return False
                hashset.add(s[i])
                hashmap[pattern[i]] = s[i]
                
        return True
            