#Time Complexity: O(n)
#Space complexity: O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hmS={}
        hmT={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in hmS:
                hmS[s[i]]=t[i]
            elif hmS[s[i]]!=t[i]:
                return False
            if t[i] not in hmT:
                hmT[t[i]]=s[i]
            elif hmT[t[i]]!=s[i]:
                return False
        return True
        