#Time complexity:O(logn)
#sapce complexity: O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1={}
        for i in range(len(s)):
            if s[i] not in dict1:
                dict1[s[i]]=t[i]
            elif t[i]!=dict1[s[i]]:
                return False
        if len(set(dict1.values()))!=len(dict1):
            return False
        return True