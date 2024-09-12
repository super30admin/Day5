#time complexity : O (1)
# space complexity: O(1)
# Runs on leetcode: Yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        i = 0
        sStr = {}
        tStr = {}

        for i in range(len(s)):
            print(i)
            sChar = s[i]
            tChar = t[i]
            print(sChar,tChar)
            if (sChar not in sStr):
                sStr[sChar] = tChar
            else:
                if sStr.get(sChar) != tChar: return False

            if (tChar not in tStr):
                tStr[tChar] = sChar
            else:
                if tStr.get(tChar) != sChar: return False
        return True

obj = Solution()
print(obj.isIsomorphic('foo','bar'))