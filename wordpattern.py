'''
Time Complexity: O(n)
Space Complexity: O(1)
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if(len(pattern) != len(s.split(" "))):
            return False
        sArr = s.split(" ")
        hashMap = {}
        for i in range(len(pattern)):
            if(pattern[i] in hashMap):
                if(hashMap[pattern[i]]!=sArr[i]):
                    return False
            else:
                if(sArr[i] in list(hashMap.values())):
                    return False
                hashMap[pattern[i]] = sArr[i]
        return True