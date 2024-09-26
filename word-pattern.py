"""
TC:O(n)
SC:O(1)

"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s=s.split()
        map1={}
        map2={}
        a= True
        b=True
        if len(s)!=len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in map1.keys():
                if map1[pattern[i]]!=s[i]:
                    a=False
            else:
                map1[pattern[i]]=s[i]
        for j in range(len(s)):
            if s[j] in map2.keys():
                if map2[s[j]]!=pattern[j]:
                    b=False
            else:
                map2[s[j]]=pattern[j]

        if a and b:
            return True
        else:
            return False
