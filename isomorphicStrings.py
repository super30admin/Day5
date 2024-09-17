#Leetcode problem: 205
class Solution:
    def isIsomorphic(self, s, t):
        sdict={}
        tdict={}
        
        for i in range(len(s)):
            if s[i] not in sdict:
                sdict[s[i]]=t[i]
            else:
                if sdict[s[i]]!=t[i]:
                    return False
            if t[i] not in tdict:
                tdict[t[i]]=s[i]
            else:
                if tdict[t[i]]!=s[i]:
                    return False
            
        return True

#TC: O(n)
#SC: O(1) because there will be constant number of characters.