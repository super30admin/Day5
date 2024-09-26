#Method 1: Two Hashmaps
# TC: O(n)
# SC: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_t = { }
        t_s = { }
        
        for i in range(len(s)):
            if s[i] in s_t:
                if s_t[s[i]] != t[i]:
                    return False
            else:
                s_t[s[i]] = t[i]
        
        for i in range(len(t)):
            if t[i] in t_s:
                if t_s[t[i]] != s[i]:
                    return False
            else:
                t_s[t[i]] = s[i]
        return True

#Method 2: One Hashmap and One Set
# TC: O(n)
# SC: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_t = { }
        t_s = set()
        
        for i in range(len(s)):
            if s[i] in s_t:
                if s_t[s[i]] != t[i]:
                    return False
            else:
                
                if t[i] in t_s:
                    return False
                s_t[s[i]] = t[i]
                t_s.add(t[i])        
        return True
        