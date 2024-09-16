# Time Complexity : O(S+T)
# Space Complexity : O(26+26) = O(1) since we can store only 26 characters in both the hashmaps
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# I have used 2 Hashmaps to map every character in S in dicts and map every character in T in dictt


class Solution:
    def isomorphicStrings(s, t):
        if len(s) != len(t):
            return False
        dicts = {}
        for i in range(len(s)):
            if s[i] not in dicts:
                dicts[s[i]] = t[i]
            else:
                if dicts[s[i]] != t[i]:
                    return False
        dictt = {}
        for i in range(len(t)):
            if t[i] not in dictt:
                dictt[t[i]] = s[i]
            else:
                if dictt[t[i]] != s[i]:
                    return False

        return True
