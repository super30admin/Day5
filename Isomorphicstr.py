# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        size_s = len(s)
        size_t = len(t)

        if size_s != size_t:
            return False

        def hashmapImpl():
            s_map = {}
            t_map = {}

            for index in range(size_s):
                s_char = s[index]
                t_char = t[index]
                if not s_map.has_key(s_char):
                    s_map[s_char] = t_char
                else:
                    if(s_map[s_char] != t_char):
                        return False
                if not t_map.has_key(t_char):
                    t_map[t_char] = s_char
                else:
                    if(t_map[t_char] != s_char):
                        return False

            return True

        def hashsetImpl():
            s_map = {}
            t_set = set()

            for index in range(size_s):
                s_char = s[index]
                t_char = t[index]
                if not s_map.has_key(s_char):
                    s_map[s_char] = t_char
                    if t_char in t_set:
                        return False
                    t_set.add(t_char)
                else:
                    if s_map[s_char] != t_char or t_char not in t_set:
                        return False
            return True

        # return hashsetImpl()
        return hashmapImpl()
