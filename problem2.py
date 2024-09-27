# group anagrams
# // Time Complexity : O(n) we iterate through the strings once each
# // Space Complexity : O(n) for extra dictionary space used
# // Did this code successfully run on Leetcode : yes
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapS={}
        mapT={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in mapS:
                mapS[s[i]]=t[i]
            else:
                if mapS[s[i]]!=t[i]:
                    return False
                
        for i in range(len(t)):
            if t[i] not in mapT:
                mapT[t[i]]=s[i]
            else:
                if mapT[t[i]]!=s[i]:
                    return False
        return True