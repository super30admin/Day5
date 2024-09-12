# Similar to isomorphic strings problem.

# Leetcode submission successful.
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        # 2 hashmaps solution.
        # TC = O(n) where n is the length of the pattern.
        # SC = O(1) as only lower case letters to be covered.

        s_arr = s.split(" ")
        if len(s_arr) != len(pattern):
            return False

        pmap = {}
        smap = {}

        # Same as isomorphic strings.
        for i in range(len(pattern)):
            if pattern[i] in pmap:
                if pmap[pattern[i]] != s_arr[i]:
                    return False
            pmap[pattern[i]] = s_arr[i]
            if s_arr[i] in smap:
                if smap[s_arr[i]] != pattern[i]:
                    return False
            smap[s_arr[i]] = pattern[i]
        return True