class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s, pattern = pattern, s
        tab = pattern.split()
        if len(s) != len(tab):
            return False
        dic1 = {}
        dic2 = {}
        for i in range(len(s)):
            if s[i] not in dic1.keys():
                dic1[s[i]] = tab[i]
            else:
                if dic1[s[i]] != tab[i]:
                    return False

        for i in range(len(s)):
            if tab[i] not in dic2.keys():
                dic2[tab[i]] = s[i]
            else:
                if dic2[tab[i]] != s[i]:
                    return False

        return True    
