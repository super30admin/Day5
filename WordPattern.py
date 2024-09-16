# Time Complexity : O(P+S)
# Space Complexity : O(26+26) = O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
#2 hashmaps to store every string in pattern and s


class Solution:
    def wordPattern(pattern, s):
        s = s.split()
        if len(pattern) != len(s):
            return False
        dictp = {}
        for i in range(len(pattern)):
            if pattern[i] not in dictp:
                dictp[pattern[i]] = s[i]
            else:
                if dictp[pattern[i]] != s[i]:
                    return False

        dicts = {}

        for i in range(len(s)):
            if s[i] not in dicts:
                dicts[s[i]] = pattern[i]
            else:
                if dicts[s[i]] != pattern[i]:
                    return False
        return True
