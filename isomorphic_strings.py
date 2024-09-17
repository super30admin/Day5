# Time Complexity : o(n)
# Space Complexity : o(1)   # there are fixed 26 alphabets, which doesn't depend on the length of input 
# Did this code successfully run on Leetcode : Yes

# Approach 1: using 1 hashmap and 1 hashset
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tset = set()
        
        for i in range(len(s)):
            if s[i] in smap:
                if t[i]!=smap[s[i]]:    # checks if the previously mapped value is equal to current T's value
                    return False
            else:
                if t[i] in tset:        #checks if the value of S's key is already seen or not, if seen then it's already taken
                    return False
                smap[s[i]] = t[i]       # not seen, therefore adding it to hashmap and hashset
                tset.add(t[i])
        return True
# Approach 1: using 2 hashmap
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:         
        smap = {}
        tmap = {}
        
        for i in range(len(s)):
            if s[i] in smap:
                if smap[s[i]] != t[i]:
                    return False
            else:
                if t[i] in tmap and tmap[t[i]] !=s[i]:      #checks if the mapping of value of S's key is equal to T's value 
                    return False
                smap[s[i]] = t[i]
                tmap[t[i]] = s[i]
        return True        