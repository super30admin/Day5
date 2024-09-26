"""
// Time Complexity : o(n), where n  is the number of characters
// Space Complexity : o(n), dictionary size
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

"""
from collections import defaultdict
class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        
        d = defaultdict()
        
        str=list(str.split(' '))# making a list of words in str, for easy iteration and mapping
        
        if len(str) != len(pattern) or len(set(pattern))!= len(set(str)) : #edge cases
            return False
        
        for i in range(len(pattern)): #mapping each word in str to each char in pattern
            if pattern[i] not in d:
                d[pattern[i]] = str[i]
            else:
                if str[i] != d[pattern[i]]: #if any point there are two words in str corresponding to the same char in pattern, return False 
                    return False
        
        return True
        