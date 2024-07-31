# Time complexity = O(n)
# Space complexity = O(n)
# Tested on leetcode
# same logic as group anagrams

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hmap = {}
        hset = set()
        s = s.split()
        if len(pattern) != len(s): return False
        for i,ch in enumerate(pattern):
            if ch in hmap:
                if hmap.get(ch) != s[i]:
                    return False
            else:
                if s[i] in hset:
                    return False
                hmap[ch] = s[i]
                hset.add(s[i])
            print(hset, hmap)
        return True
        