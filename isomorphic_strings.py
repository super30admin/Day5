# TIme: O(n), n = len of string s/t <= 5*10^4
# Space: O(2 * 26 chars) = O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict_s = {}
        dict_t = {}
        for i in range(0, len(s)): # time: n
            if s[i] in dict_s: # time o(1)
                if dict_s.get(s[i]) != t[i]: # time: O(1)
                    return False
            else:
                dict_s[s[i]] = t[i] # time: O(1), space: O(26 chars)
            if t[i] in dict_t: # time o(1)
                if dict_t.get(t[i]) != s[i]: # time: O(1)
                    return False
            else:    
                dict_t[t[i]] = s[i] # time: O(1), space: O(26 chars)
        return True
        