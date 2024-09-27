#Running time complexity: O(n)
#Space complexity: constant or O(1) -->  26 alphabets in hashmap
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False
        Hmap1 = {}
        Hmap2 = {}
        for i in range(len(s)):
            if s[i] in Hmap1:
                if Hmap1[s[i]] != t[i]:
                    return False
            else:
                Hmap1[s[i]]=t[i]#mapping of s element
            if t[i] in Hmap2:
                if Hmap2[t[i]] != s[i]:
                    return False
            else:
                Hmap2[t[i]]=s[i]#mapping of t element
        return True