#Time complexity: O(n) because 2 strings iteration
#Space complexity: O(1) because hashmap has char number of keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # two maps to check mapping both ways
        st_map = {}
        ts_map = {}
        # checking if len is same or not
        if len(s) != len(t):
            return False
        for idx,el in enumerate(s):
            if not st_map.has_key(s[idx]):
                st_map[s[idx]] = t[idx]
            else:
                # if s->t map has a diff value, not an isomorphic string
                if st_map[s[idx]] != t[idx]:
                    return False
            if not ts_map.has_key(t[idx]):
                ts_map[t[idx]] = s[idx]
            else:
                # if t->s map has a diff value, not an isomorphic string
                if ts_map[t[idx]] != s[idx]:
                    return False
        return True
            
        