# Time Complexity : O(N)
# Space Complexity : O(1) as no extra space, the hashmap take O(26) => O(1) space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Took me a little while to understand the logic



def isomorphic(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False    
    smap = {}
    tmap = {}
    for i in range(len(s)):
        if s[i] not in smap:
            smap[s[i]] = t[i]
        else:
            if smap[s[i]] != t[i]:
                return False
        
            if t[i] not in tmap:
                tmap[t[i]] = s[i]
            else:
                if tmap[t[i]] != s[i]:
                    return False
    return True     
            
s = "paper"
t = "title"
print(isomorphic(s, t))