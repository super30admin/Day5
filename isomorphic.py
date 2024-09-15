'''
Time Complexity: O(n)
Space Complexity: O(1)
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        hashMap = {}
        for i in range(len(s)):
            if(s[i] in hashMap):
                if(hashMap[s[i]]!=t[i]):
                    return False
            else:
                if(t[i] in list(hashMap.values())):
                    return False
                hashMap[s[i]] = t[i]
        return True
        