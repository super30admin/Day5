# Time complexity -> O(N)
# Space complexity -> O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashMap = {}
        hashSet = set()
        
        s = s.split(' ')
        
        if len(s) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] in hashMap:
                if hashMap[pattern[i]] != s[i]:
                    return False
            else:
                if s[i] in hashSet:
                    return False
                hashMap[pattern[i]] = s[i]
                hashSet.add(s[i])
                
        return True