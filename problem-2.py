# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
def isIsomorphic(s: str, t: str) -> bool:
    s2t, t2s = {}, {}
        
    for i in range(len(s)):
        if s[i] in s2t:
            if s2t[s[i]] != t[i]:
                return False
        if t[i] in t2s:
            if t2s[t[i]] != s[i]:
                return False
            
        s2t[s[i]] = t[i]
        t2s[t[i]] = s[i]
    return True
        

s = "egg"
t = "add"

print(isIsomorphic(s,t))