#Time Complexity : O(n)
#Space Complexity : O(1)
# Space is constant here because of the number of alphabets known to humans in the english alphabet. 
# Time is linear because of the dictionary/hashmap being stored one for each string



class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t): return False
        
        sdict = {}
        tdict = {}
        
        for i in range(0,len(s)):
            if s[i] not in sdict.keys():
                sdict[s[i]] = t[i]
            else:
                if sdict[s[i]] != t[i]:
                    return False
        for i in range(0,len(s)):
            if t[i] not in tdict.keys():
                tdict[t[i]] = s[i]
            else:
                if tdict[t[i]] != s[i]:
                    return False
        
        return True
        