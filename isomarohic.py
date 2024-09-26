class Solution:#Time O(n) space O(n)
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap={}
        tMap={}
        for i in range(len(s)):
            if s[i] not in sMap:
                sMap[s[i]]=t[i]
            else:
                if sMap[s[i]]!=t[i]:
                    return False
            if t[i] not in tMap:
                tMap[t[i]]=s[i]
            else:
                if tMap[t[i]]!=s[i]:
                    return False
        return True
