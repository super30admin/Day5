#LC 290 -  Word Pattern
#Time Complexity - O(n)
#Space Complexity - O(n)
from collections import defaultdict
class Solution(object):
    def wordPattern(self, pattern, str1):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        
        tmp = str1.split()
        d = defaultdict(str)
        vis = set()
        if len(tmp) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in d.keys() and tmp[i] not in vis:
                d[pattern[i]] = tmp[i]
                vis.add(tmp[i])
            elif pattern[i] in d.keys():
                if d[pattern[i]] != tmp[i]:
                    return False
            else:
                return False
        return True