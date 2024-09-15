# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashMap1 = {}
        hashMap2 = {}
        s = list(s.split(" "))

        if len(pattern) != len(s):
            return False

        for i in range(len(pattern)):
            if pattern[i] in hashMap1.keys():
                if s[i] in hashMap2.keys():
                    if hashMap1[pattern[i]] != s[i] or hashMap2[s[i]] != pattern[i]:
                        return False
                else:
                    return False

            elif s[i] in hashMap2.keys():
                return False
            else:
                hashMap1[pattern[i]] = s[i]
                hashMap2[s[i]] = pattern[i]
        return True
