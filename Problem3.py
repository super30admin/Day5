class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashm = dict()
        s = s.split(" ")
        print(s)
        if len(pattern)!=len(s):
            return False
        for i in range(len(pattern)):
            val = pattern[i]
            if val not in hashm.keys():
                if s[i] in hashm.values():
                    return False
                hashm[val]=s[i]
            elif val in hashm.keys():
                if hashm[val]==s[i]:
                    continue
                else:
                    return False
        return True
