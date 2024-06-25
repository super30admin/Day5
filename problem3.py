# time: O(n)
# space: O(n)

# step1: create a hash to map characters from s to t and t to s.
# step2: if the mapping is present and the character does not match then return false
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_t ={}
        t_s ={}

        for a,b in zip(s,t):

            if (a in s_t and s_t[a] != b) or (b in t_s and t_s[b] != a):
                return False

            s_t[a] = b
            t_s[b] = a

        return True