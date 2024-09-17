class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dicts = {}
        dictt = {}
        for i in range(len(s)):
            if s[i] in dicts:
                if dicts[s[i]] != t[i]:
                    return False
            else:
                dicts[s[i]] = t[i]
                
            if t[i] in dictt:
                if dictt[t[i]] != s[i]:
                    return False
            else:
                dictt[t[i]] = s[i]
        
        return True