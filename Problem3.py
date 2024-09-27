# Time Complexity : O(n) where n in the length of the pattern.
# Space Complexity : O(n) as we are using dict and temp which in worst case will be O(n).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        l = s.split()
        d= {}
        temp = []
        if len(l) !=  len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in d:
                if l[i] in temp:
                    return False
                d[pattern[i]] = l[i]
                temp.append(l[i])
            else:
                if d[pattern[i]] != l[i]:
                    return False
        return True
