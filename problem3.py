# Time Complexity : O(n)
# Space Complexity:o(n)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        arrS = s.split()

        if len(pattern) == 0 or len(arrS) == 0 or len(pattern) != len(arrS):
            return False

        hashMap = {}
        hashSet = set()

        for i in range(0, len(arrS)):
            if pattern[i] in hashMap:
                if hashMap[pattern[i]] != arrS[i]:
                    return False
            else:
                if arrS[i] in hashSet:
                    return False
                else:
                    hashMap[pattern[i]] = arrS[i]
                    hashSet.add(arrS[i])

        return True
