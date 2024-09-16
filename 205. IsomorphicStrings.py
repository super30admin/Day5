


# Time Complexity : O(N)
# Space Complexity: O(1)
# Passed in leet code

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dicts = {}
        dictt = {}
        i = 0

        if len(s) != len(t):
            return "false"
    
        while i < len(s):
            if (s[i] not in dicts) and (t[i] not in dictt):
                dicts[s[i]] = t[i]
                dictt[t[i]] = s[i]

            elif dicts.get(s[i]) != t[i] or dictt.get(t[i]) != s[i]:
                return  "false"
        return "true"
  