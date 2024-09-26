# Time Complexity : O(n)
# Space Complexity:o(n)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tSet = set()
        for i in range(0, len(s)):
            print(s[i], t[i])
            if s[i] not in sMap:
                if t[i] not in tSet:
                    sMap[s[i]] = t[i]
                    tSet.add(t[i])
                else:
                    return False
            else:
                if sMap.get(s[i]) != t[i]:
                    return False

        return True
