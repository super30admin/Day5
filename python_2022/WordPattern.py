# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, s: str, t: str) -> bool:
        t = t.split()
        if len(s) != len(t):
            return False
        dictu = {}
        dictu1 = {}
        for i in range(len(s)):
            if s[i] in dictu and dictu[s[i]] != t[i]:
                return False
            elif t[i] in dictu1 and dictu1[t[i]] != s[i]:
                return False
            dictu[s[i]] = t[i]
            dictu1[t[i]] = s[i]
        return True


check = Solution()
print(check.wordPattern('abba', 'dog cat cat dog'))
print(check.wordPattern('abba', 'dog cat cat fish'))
print(check.wordPattern('aaaa', 'dog cat cat dog'))
print(check.wordPattern('abba', 'dog dog dog dog'))