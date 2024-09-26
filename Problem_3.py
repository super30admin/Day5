# Word Pattern

# Time Complexity : O(nW)
# Space Complexity : O(nW)
# Did this code successfully run on Leetcode : Yes, Runtime: 20 ms and Memory Usage: 13.4 MB
# Any problem you faced while coding this : Yes in finding Time and Space Complexity
# Your code here along with comments explaining your approach
# Approach
"""
One to One correspondence is to be done between pattern and str by 
implementing hashmap in Python. Using split() function the words in str are split and compared to
the one with pattern hashmap. If its matching return True else False.

"""
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        pattern_map={}
        s_map={}
        ns=len(pattern)
        i=0
        words=s.split(" ")
        if (ns!= len(words)):
            return False
        while i<ns:
            char=pattern[i]
            word=words[i]
            if (char in pattern_map)!=(word in s_map):
                return False
            if char in pattern_map:
                if(s_map[word]!=char) or(pattern_map[char]!=word):
                    return False
            else:
                    pattern_map[char]=word
                    s_map[word]=char
            i=i+1
        return i==ns