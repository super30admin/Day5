class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        pattern_map = {}
        s_map = {}
        s_split = s.split(" ")
        if len(s_split) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in pattern_map:
                pattern_map[pattern[i]] = s_split[i]
            elif pattern_map[pattern[i]] != s_split[i]:
                return False
            if s_split[i] not in s_map:
                s_map[s_split[i]] = pattern[i]
            elif s_map[s_split[i]] != pattern[i]:
                return False
        return True

#Time Complexity: O(max(m,n)) 
#Space Complexity: O(max(m,n))
#m is length of pattern and n is length of s