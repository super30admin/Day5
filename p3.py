# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


#  Your code here along with comments explaining your approach


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sa = s.split()

        if len(sa) != len(pattern):
            return False

        d1 = dict()
        d2 = dict()

        for i in range(len(sa)):
            if pattern[i] in d1:
                if d1[pattern[i]] != sa[i]:
                    return False
            else:
                d1[pattern[i]] = sa[i]

            if sa[i] in d2:
                if d2[sa[i]] != pattern[i]:
                    return False
            else:
                d2[sa[i]] = pattern[i]

        return True
