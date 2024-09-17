# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

def isIsomorphic(s,t):
    if len(s) != len(t):
        return False
    
    smap = {}
    tmap = {}
    for i in range(0,len(s)):
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

s = "foo"
t = "bar"
print(isIsomorphic(s,t))