# Time Complexity : O(n) where n in the length of the strings.
# Space Complexity : O(n) as we are using temp which will be equal to the length of the string.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d = {}
        temp = ""
        l = []
        for i in range(len(s)):
            if s[i] not in d:
                if t[i] in l:
                    return False
                d[s[i]] = t[i]
                l.append(t[i])
                temp += t[i]
            else:
                temp += d[s[i]]
        return temp == t
