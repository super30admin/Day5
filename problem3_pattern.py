# Time Complexity : N : number of characters in patter or number of words in pattern
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map = {}
        word_map = {}
        slist = s.split()
        if len(pattern) != len(slist):
            return False
        for i in range(len(pattern)):
            if pattern[i] in map:
                if map[pattern[i]] != slist[i]:
                    return False
            else:
                map[pattern[i]] = slist[i]
            if slist[i] in word_map:
                if word_map[slist[i]] != pattern[i]:
                    return False
            else:
                word_map[slist[i]] = pattern[i]

        return True
