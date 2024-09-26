#Method 1: 
# TC: O(n)
# SC: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p_s = { }
        s_p = { }
        s = s.split()
        if len(s) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in p_s:
                if p_s[pattern[i]] != s[i]:
                    return False
            else:
                p_s[pattern[i]] = s[i]
                print(s[i])
                
        for i in range(len(s)):
            if s[i] in s_p:
                if s_p[s[i]] != pattern[i]:
                    return False
            else:
                s_p[s[i]] = pattern[i]
        return True
                