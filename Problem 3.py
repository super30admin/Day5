#Similar to isomorphic strings, 2 hashmaps and matching
#Time is O(nk)
#Space is O(n)
#Yes this worked in leetcode


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sarr = s.split(" ")
        if len(pattern)!=len(sarr):
            return False
        map1 = {}
        map2 = {}
        for i in range(len(sarr)):
            if sarr[i] in map1:
                if map1[sarr[i]] != pattern[i]:
                    return False
            else:
                map1[sarr[i]] = pattern[i]
            if pattern[i] in map2:
                if map2[pattern[i]] != sarr[i]:
                    return False
            else:
                map2[pattern[i]] = sarr[i]
        return True