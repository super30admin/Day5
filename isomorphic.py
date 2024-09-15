# Time Complexity : O(N)
# Space Complexity : O(1) #26 chars
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s2t = {}
        t2s = {}

        for i in range(len(t)):
            if (s[i] in s2t.keys() and s2t.get(s[i])!=t[i]) or (t[i] in t2s.keys() and t2s.get(t[i])!=s[i]):
                return False
            else:
                s2t[s[i]] = t[i]
                t2s[t[i]] = s[i]
        return True

obj = Solution()
s = 'paper'
t = 'title'

print(obj.isIsomorphic(s,t))
