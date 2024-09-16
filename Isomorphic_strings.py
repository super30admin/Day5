# Time Complexity : O(N)
# Space Complexity = O(1)
# Yes it ran on Leetcode.


class Solution(object):
    def isIsomorphic(self, s, t):
        dic = {}
        dic_2 = {}
        if len(s) == 0:
            return True

        for i in range(len(s)):
            if s[i] in dic:
                if t[i] != dic[s[i]]:
                    return False
            else:
                dic[s[i]] = t[i]

        for i in range(len(t)):
            if t[i] in dic_2:
                if s[i] != dic_2[t[i]]:
                    return False
            else:
                dic_2[t[i]] = s[i]

        return True
