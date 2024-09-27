#Running time complexity: O(n)
#Space complexity: Constant or O(1), Worst case: maximum 26 alphabet can be present in a hasmap
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        if len(pattern) != len(s): return False
        Hmap1 = {}
        Hmap2 = {}
        for i in range(len(pattern)):
            if pattern[i] in Hmap1:
                if Hmap1[pattern[i]] != s[i]:
                    return False
            else:
                Hmap1[pattern[i]] = s[i]
            if s[i] in Hmap2:
                if Hmap2[s[i]] != pattern[i]:
                    return False
            else:
                Hmap2[s[i]]=pattern[i]
        return True