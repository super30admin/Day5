class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False
        hashmap1 = dict()
        hashmap2 = dict()
        
        for i in range(len(s)):
            if(hashmap1.get(s[i]) is None or hashmap1.get(s[i]) == t[i]):
                hashmap1[s[i]] = t[i]
            else:
                return False
        for i in range(len(t)):
            if(hashmap2.get(t[i]) is None or hashmap2.get(t[i]) == s[i]):
                hashmap2[t[i]] = s[i]
            else:
                return False
        return True
               