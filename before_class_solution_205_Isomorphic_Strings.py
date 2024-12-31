# time complexity: O(n)
# space complexity: O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map= dict()
        t_set= set()
        if (len(s) != len(t)):
            return False
        for i in range(len(s)):
            if s[i] not in s_map:
                if ( t[i] not in t_set):
                    s_map[s[i]] = t[i]
                    t_set.add(t[i])
                else:
                    return False
            if( s_map[s[i]] != t[i]):
                return False
        return True
