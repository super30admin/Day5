# Time complexity: O(n)
# Space complexity: O(n)
        
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """        
        words = s.split(" ")
        if not len(words) == len(pattern):
            return False
        
        d = {}
        
        for i in range(len(words)):
            if pattern[i] not in d:
                if words[i] not in d.values(): 
                    d[pattern[i]] = words[i]
                else:
                    return False
            else:
                if not d[pattern[i]] == words[i]:
                    return False
        return True